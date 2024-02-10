package utils.dynamodb;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse;
import software.amazon.awssdk.services.iam.IamClient;
import software.amazon.awssdk.services.iam.model.*;
import utils.CommonUtils.CommonConstants;
import utils.CommonUtils.PropertiesUtil;
import utils.CommonUtils.TestLogger;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

/**
 * Class to perform dynamo db operations
 * @author ssamaji.
 * Created Feb 10, 2024.
 */
public class DynamoDbEntity extends TestLogger {
    private DynamoDbEntity() {}
    private static final DynamoDbEntity instance = new DynamoDbEntity();
    public static DynamoDbEntity getInstance() {
        return instance;
    }
    PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();

    /**
     * Helper to make dynamo db connection
     * @param uri -
     * @param region - region can be US_EAST_1, US_EAST_SINGAPORE
     * @return
     * @throws IOException
     */
    private DynamoDbClient makeDDbConnection(String uri,Region region) throws IOException {
        AwsBasicCredentials accessKeys = generateDynamoDbAccessKeys();
        return DynamoDbClient.builder()
                .endpointOverride(URI.create(uri))
                .region(region)
                .credentialsProvider(StaticCredentialsProvider.create(
                        AwsBasicCredentials.create(accessKeys.accessKeyId(), accessKeys.secretAccessKey())))
                .build();
    }

    /**
     *
     * @param tableName - table name
     * @param uri - aws url
     * @param region - region
     * @param primaryKey - can be primary key of the db
     * @param primaryKeyValue - primary value which you want to retrieve
     * @return
     * @throws IOException
     */
    public Map<String, AttributeValue> getDynamoData(String tableName,String uri,Region region,String primaryKey,String primaryKeyValue) throws IOException {
        Map<String, AttributeValue> item = null;
        DynamoDbClient dynamoDbClient = makeDDbConnection(uri, region);
        // Specify the key attribute and its value for the item you want to fetch
        Map<String, AttributeValue> keyToGet = Map.of(primaryKey, AttributeValue.builder().s(primaryKeyValue).build());

        GetItemRequest getItemRequest = GetItemRequest.builder()
                .tableName(tableName)
                .key(keyToGet)
                .build();

        try {
            GetItemResponse getItemResponse = dynamoDbClient.getItem(getItemRequest);
            item= getItemResponse.item();
            if (item != null) {
                logInfo("Retrieved Item: " + item);
            } else {
                logInfo("Item not found");
            }
        } catch (DynamoDbException e) {
            logInfo("Error fetching data: " + e.getMessage());
        } finally {
            dynamoDbClient.close();
        }

        return item;
    }

    private AwsBasicCredentials generateDynamoDbAccessKeys() throws IOException {
        propertiesUtil.getDBProperties();
        createIAMUser(propertiesUtil.getDBProperties().getProperty(String.valueOf(CommonConstants.CONFIGS.DYNAMODB_USERNAME)));
        attachDynamoDBFullAccessPolicy(propertiesUtil.getDBProperties().getProperty(String.valueOf(CommonConstants.CONFIGS.DYNAMODB_USERNAME)),
                propertiesUtil.getDBProperties().getProperty(String.valueOf(CommonConstants.CONFIGS.POLICY_NAME)));
       return generateAccessKey(propertiesUtil.getDBProperties().getProperty(String.valueOf(CommonConstants.CONFIGS.DYNAMODB_USERNAME)));
    }

    private static AwsBasicCredentials generateAccessKey(String userName) {
        IamClient iamClient = IamClient.builder().region(Region.AWS_GLOBAL).build();
        CreateAccessKeyResponse response = iamClient.createAccessKey(CreateAccessKeyRequest.builder()
                .userName(userName)
                .build());
        return AwsBasicCredentials.create(response.accessKey().accessKeyId(), response.accessKey().secretAccessKey());
    }

    private static CreateUserResponse createIAMUser(String userName) {
        IamClient iamClient = IamClient.builder().region(Region.AWS_GLOBAL).build();
        return iamClient.createUser(CreateUserRequest.builder()
                .userName(userName)
                .build());
    }

    private static void attachDynamoDBFullAccessPolicy(String userName, String policyName) {
        IamClient iamClient = IamClient.builder().region(Region.AWS_GLOBAL).build();
        AttachUserPolicyResponse response = iamClient.attachUserPolicy(AttachUserPolicyRequest.builder()
                .userName(userName)
                .policyArn("arn:aws:iam::aws:policy/AmazonDynamoDBFullAccess") // Using a predefined DynamoDB policy
                .build());
    }

}

