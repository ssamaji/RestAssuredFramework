package helpers.bookings;

import com.protos.CreateBookingResponse;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import org.testng.asserts.SoftAssert;
import utils.CommonUtils.TestLogger;

/**
 * Validator class to validate api responses
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class BookingValidator extends TestLogger {
    private static final BookingValidator instance = new BookingValidator();

    // private constructor to avoid client applications using the constructor
    private BookingValidator(){}

    public static BookingValidator getInstance() {
        return instance;
    }

    Constants constants = new Constants();
    /**
     * Validator to validate employee name in create employee request
     * @param response
     */
    public void validateCreateBooking(CreateBookingResponse response){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getBooking().getFirstname(),constants.FIRSTNAME);
        softAssert.assertEquals(response.getBooking().getLastname(),constants.LAST_NAME);
        softAssert.assertEquals(response.getBooking().getTotalprice(),constants.TOTAL_PRICE);
        softAssert.assertEquals(response.getBooking().getDepositpaid(),constants.DEPOSITE_PAID);
        softAssert.assertEquals(response.getBooking().getBookingdates().getCheckin(),constants.CHECKIN_DATE);
        softAssert.assertEquals(response.getBooking().getBookingdates().getCheckout(),constants.CHECKOUT_DATE);
        softAssert.assertEquals(response.getBooking().getAdditionalneeds(),constants.ADDITIONAL_NEEDS);
        softAssert.assertAll();
    }

}
