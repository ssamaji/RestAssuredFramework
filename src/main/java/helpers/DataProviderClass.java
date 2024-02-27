package helpers;
import org.testng.annotations.DataProvider;

import java.util.*;

    /**
     * This class can be use to create a test data
     */
    public class DataProviderClass {

        @DataProvider(name = "orderStatusFlow")
        public Iterator<Object[]> orderStatusFlow() {
            ArrayList<Object[]> flowNewOrderStatus = new ArrayList<Object[]>();
            String[] orderDelay= new String[]{"ontime","delayed"};
            String[] legWiseDelay = new String[0];
            String messageString = null;
            HashMap<String,String[][]> mappings = new HashMap<>();
            //Order Not delayed Cases -----  First value is the flow list from flow mapper,
            // 2nd is vendor list and 3rd is delivery list
            mappings.put("case1", new String[][] {{"flow1","flow2","flow3"},
                    {"shipped","notShipped"},
                    {"pickedup","in-transit","out-for-delivery","delivered"}});

            Iterator<Map.Entry<String, String[][]>> itr = mappings.entrySet().iterator();
            System.out.println("itr "+itr);
            while (itr.hasNext()) {
                Map.Entry<String, String[][]> entry = itr.next();
                System.out.println("entry "+entry);
                String scenarios[][] = entry.getValue();
                //Loop through the first list of valid flows
                for(int i=0;i<scenarios[0].length;i++) {
                    //Loop through the second list of vendor status
                    for (int j = 0; j < scenarios[1].length; j++) {
                        //Loop through the third list of delivery status
                        for (int k = 0; k < scenarios[2].length; k++) {
                            for (int x = 0; x <orderDelay.length; x++) {
                                for (int l = 0; l < legWiseDelay.length; l++) {
                                    HashMap<String, String> scenarioData = new HashMap<>();
                                    scenarioData.put("deliveryStatus", scenarios[2][k]);
                                    scenarioData.put("vendorStatus", scenarios[1][j]);
                                    scenarioData.put("flow", scenarios[0][i]);
                                    scenarioData.put("legWiseDelay", legWiseDelay[l]);
                                    String key = scenarios[1][j] + "_" + scenarios[2][k];
                                    scenarioData.put("orderWiseDelay", orderDelay[x]);
                                    key = key + "_" + orderDelay[x];
                                    if (legWiseDelay[l].equals("delayed")) {
                                        messageString = "show order delay messages";
                                    } else {
                                        messageString = "show order on-time messages";
                                    }
                                    scenarioData.put("messageString", messageString);
                                    System.out.println(" map "+scenarioData);
                                    flowNewOrderStatus.add(new Object[]{scenarioData});
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(" flowNewOrderStatus "+flowNewOrderStatus);
            return flowNewOrderStatus.iterator();
        }
}
