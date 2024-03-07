package helpers.employees;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

    /**
     * This class can be use to create a test data
     */
    public class DataProviderClass {

        @DataProvider(name = "orderStatusFlow",parallel = true)
        public Iterator<Object[]> orderStatusFlow() {
            ArrayList<Object[]> flowNewOrderStatus = new ArrayList<Object[]>();
            String[] orderDelay= new String[]{"ontime","delayed","test","test2","test3"};
            String messageString = null;
            HashMap<String,String[][]> mappings = new HashMap<>();
            //Order Not delayed Cases -----  First value is the flow list from flow mapper,
            // 2nd is vendor list and 3rd is delivery list
            mappings.put("case1", new String[][] {{"flow1","flow2","flow3","flow4","flow5","flow6"},
                    {"shipped","notShipped","test"},
                    {"pickedup","in-transit","out-for-delivery","delivered"}});

            Iterator<Map.Entry<String, String[][]>> itr = mappings.entrySet().iterator();
//            System.out.println("itr "+itr.next().getKey());
            while (itr.hasNext()) {
                Map.Entry<String, String[][]> entry = itr.next();
                System.out.println("entry "+entry.getKey());
                String scenarios[][] = entry.getValue();
                //Loop through the first list of valid flows
                for(int i=0;i<scenarios[0].length;i++) {
                    //Loop through the second list of vendor status
                    for (int j = 0; j < scenarios[1].length; j++) {
                        //Loop through the third list of delivery status
                        for (int k = 0; k < scenarios[2].length; k++) {
                            for (int x = 0; x <orderDelay.length; x++) {
                                    HashMap<String, String> scenarioData = new HashMap<>();
                                    scenarioData.put("deliveryStatus", scenarios[2][k]);
                                    scenarioData.put("vendorStatus", scenarios[1][j]);
                                    scenarioData.put("flow", scenarios[0][i]);
                                    scenarioData.put("orderWiseDelay", orderDelay[x]);
                                        messageString = "show order on-time messages";
                                    scenarioData.put("messageString", messageString);
                                    System.out.println(" map "+scenarioData);
                                    flowNewOrderStatus.add(new Object[]{scenarioData});
                            }
                        }
                    }
                }
            }
            System.out.println(" flowNewOrderStatus "+flowNewOrderStatus);
            return flowNewOrderStatus.iterator();
        }

        @DataProvider(name = "readTestDataFromSheet")
        public static Object[][] readTestDataFromSheet() throws IOException {
            FileInputStream file = new FileInputStream("src/test/resources/Untitled_spreadsheet.xlsx");
            Workbook wb = WorkbookFactory.create(file);
            Sheet sheet = wb.getSheetAt(0);
            int rowCount = sheet.getLastRowNum();
            Row r = sheet.getRow(0);
            int columnCount = r.getLastCellNum();
            Cell c =r.getCell(0);
            Object[][] data = new Object[rowCount][columnCount];
            for(int i=0;i<rowCount;i++){
                for(int j=0;j< r.getLastCellNum();j++){
                    Row row = sheet.getRow(i);
                    Cell cell =row.getCell(j);
                    data[i][j] = cell.getStringCellValue();
                }
            }
            System.out.println(" map "+Arrays.asList(data));
            return data;
        }
}
