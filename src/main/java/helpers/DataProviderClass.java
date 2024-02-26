package helpers;
import org.testng.annotations.DataProvider;

import java.util.*;

    /**
     * This class can be use to create a test data
     */
    public class DataProviderClass {

        /**
         * Data Provider of order status flow in decx
         * @param context
         * @return
         */
//        @DataProvider(name = "decxWIMOSmartReplies")
//        public Iterator<Object[]> decxWIMOSmartReplies(ITestContext context) {
//            String vendorStatus ="placed";
//            HashMap<OrderStatus.Status, HelpcenterBotWorkflows[]> cases = new HashMap<>();
//            cases.put(OrderStatus.Status.CONFIRMED,new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.DECX_ORDER_STATUS_ON_THE_WAY_TO_PICKUP,
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_ON_THE_WAY_TO_PICKUP_DE_NOT_MOVING,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FOLLOWING_MAP,HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FASTEST_ROUTE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_A_QUICK_STOP,HelpcenterBotWorkflows.DECX_MOVING_TOWARDS_RX_DE_ALREADY_STARTED});
//            cases.put(OrderStatus.Status.ARRIVED, new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.DECX_ORDER_STATUS_ON_THE_WAY_TO_PICKUP,
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_ON_THE_WAY_TO_PICKUP_DE_NOT_MOVING,
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_ORDER_BEING_PREPARED, HelpcenterBotWorkflows.DECX_ORDER_STATUS_LONG_QUEUE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FOLLOWING_MAP, HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FASTEST_ROUTE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_A_QUICK_STOP,HelpcenterBotWorkflows.DECX_MOVING_TOWARDS_RX_DE_ALREADY_STARTED});
//            //for picked up,delivered and reached status DECX_ORDER_STATUS_ON_THE_WAY_TO_DELIVER and DECX_ORDER_STATUS_DE_ON_THE_WAY_TO_DELIVERY_DE_NOT_MOVING flow not working, so commented for now
//            cases.put(OrderStatus.Status.PICKEDUP, new HelpcenterBotWorkflows[]{ HelpcenterBotWorkflows.DECX_ORDER_STATUS_ORDER_BEING_PREPARED,
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_LONG_QUEUE, HelpcenterBotWorkflows.DECX_DE_NOT_MOVING_LOCATION_NOT_UPDATED,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FOLLOWING_MAP,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FASTEST_ROUTE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_A_QUICK_STOP});
//            cases.put(OrderStatus.Status.REACHED, new HelpcenterBotWorkflows[]{ HelpcenterBotWorkflows.DECX_DE_NOT_MOVING_LOCATION_NOT_UPDATED,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FOLLOWING_MAP,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FASTEST_ROUTE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_A_QUICK_STOP});
//            cases.put(OrderStatus.Status.DELIVERED, new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.DECX_DE_NOT_MOVING_LOCATION_NOT_UPDATED,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FOLLOWING_MAP,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FASTEST_ROUTE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_A_QUICK_STOP});
//            return getTestData(cases,vendorStatus);
//        }

//        @DataProvider(name = "decxWIMOSmartRepliesSanity")
//        public Iterator<Object[]> decxWIMOSmartRepliesSanity(ITestContext context) {
//            String vendorStatus ="placed";
//            HashMap<OrderStatus.Status, HelpcenterBotWorkflows[]> cases = new HashMap<>();
//            cases.put(OrderStatus.Status.CONFIRMED,new HelpcenterBotWorkflows[]{
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_ON_THE_WAY_TO_PICKUP_DE_NOT_MOVING,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FOLLOWING_MAP,
//                    HelpcenterBotWorkflows.DECX_MOVING_TOWARDS_RX_DE_ALREADY_STARTED});
//            cases.put(OrderStatus.Status.ARRIVED, new HelpcenterBotWorkflows[]{
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_ORDER_BEING_PREPARED,
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_LONG_QUEUE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FASTEST_ROUTE,
//                    HelpcenterBotWorkflows.DECX_MOVING_TOWARDS_RX_DE_ALREADY_STARTED});
//            cases.put(OrderStatus.Status.PICKEDUP, new HelpcenterBotWorkflows[]{
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_ORDER_BEING_PREPARED,
//                    HelpcenterBotWorkflows.DECX_ORDER_STATUS_LONG_QUEUE,
//                    HelpcenterBotWorkflows.DECX_DE_NOT_MOVING_LOCATION_NOT_UPDATED});
//            cases.put(OrderStatus.Status.REACHED, new HelpcenterBotWorkflows[]{
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_A_QUICK_STOP});
//            cases.put(OrderStatus.Status.DELIVERED, new HelpcenterBotWorkflows[]{
//                    HelpcenterBotWorkflows.DECX_DE_NOT_MOVING_LOCATION_NOT_UPDATED,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FOLLOWING_MAP,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_FASTEST_ROUTE,
//                    HelpcenterBotWorkflows.DECX_TAKING_DIFFERENT_ROUTE_A_QUICK_STOP});
//            return getTestData(cases,vendorStatus);
//        }

        /**
         * Delivery Instruction data provider in decx flow
         * @param context
         * @return
         */
//        @DataProvider(name = "decxDeliveryInstructionSmartReplies")
//        public Iterator<Object[]> decxDeliveryInstructionSmartReplies(ITestContext context) {
//            String vendorStatus ="placed";
//            // We can execute the workflows by passing it in testng
//            HashMap<OrderStatus.Status, HelpcenterBotWorkflows[]> cases = new HashMap<>();
//            cases.put(OrderStatus.Status.ARRIVED, new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.DECX_DELIVERY_INSTRUCTION_LEAVE_AT_GATE,
//                    HelpcenterBotWorkflows.DECX_DELIVERY_INSTRUCTION_ALTERNATE_NUMBER});
//            cases.put(OrderStatus.Status.PICKEDUP, new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.DECX_DELIVERY_INSTRUCTION_LEAVE_AT_GATE,
//                    HelpcenterBotWorkflows.DECX_DELIVERY_INSTRUCTION_ALTERNATE_NUMBER});
//            cases.put(OrderStatus.Status.DELIVERED, new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.DECX_DELIVERY_INSTRUCTION_LEAVE_AT_GATE,
//                    HelpcenterBotWorkflows.DECX_DELIVERY_INSTRUCTION_ALTERNATE_NUMBER});
//            return getTestData(cases,vendorStatus);
//        }

        /**
         * This can be use to map the test data
         * @param cases -- sequence of bot flows
         * @param vendorStatus
         * @return
         */
//        public Iterator<Object[]> getTestData(HashMap<OrderStatus.Status, HelpcenterBotWorkflows[]> cases,String vendorStatus){
//            ArrayList<Object[]> orderStatusFlow = new ArrayList<Object[]>();
//            for (Map.Entry<OrderStatus.Status, HelpcenterBotWorkflows[]> entry : cases.entrySet()){
//                OrderStatus.Status orderStatus = entry.getKey();
//                HelpcenterBotWorkflows[] useCases = entry.getValue();
//                for (int j = 0; j < useCases.length; j++) {
//                    HashMap<String, String> scenarioData = new HashMap<>();
//                    scenarioData.put("deliveryStatus", orderStatus.toString());
//                    scenarioData.put("vendorStatus", vendorStatus);
//                    scenarioData.put("useCase", useCases[j].toString());
//                    orderStatusFlow.add(new Object[]{scenarioData});
//                }
//            }
//            return orderStatusFlow.iterator();
//        }

        /**
         * This can be use to map Marked delivered incorrectly (MDI) the test data
         * @param context
         * @return
         */
//        @DataProvider(name = "mdiTestData")
//        public Iterator<Object[]> mdiTestData(ITestContext context) {
//            String vendorStatus ="placed";
//            HashMap<OrderStatus.Status, HelpcenterBotWorkflows[]> cases = new HashMap<>();
//            cases.put(OrderStatus.Status.DELIVERED,new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.MDI_DE_BRINGING_ORDER,
//                    HelpcenterBotWorkflows.MDI_DE_NOT_REACHABLE,
//                    HelpcenterBotWorkflows.MDI_DE_REFUSING_TO_DELIVER,});
//            ArrayList<Object[]> orderStatusFlow = new ArrayList<Object[]>();
//            for (Map.Entry<OrderStatus.Status, HelpcenterBotWorkflows[]> entry : cases.entrySet()){
//                OrderStatus.Status orderStatus = entry.getKey();
//                HelpcenterBotWorkflows[] useCases = entry.getValue();
//                for (int j = 0; j < useCases.length; j++) {
//                    HashMap<String, String> scenarioData = new HashMap<>();
//                    scenarioData.put("deliveryStatus", orderStatus.toString());
//                    scenarioData.put("vendorStatus", vendorStatus);
//                    scenarioData.put("workflow", useCases[j].toString());
//                    orderStatusFlow.add(new Object[]{scenarioData});
//                }
//            }
//            return orderStatusFlow.iterator();
//        }

        /**
         * This can be use to map Egregious Delay test data
         * @return
         */
//        @DataProvider(name = "EgregiousDelayDP")
//        public Object[][] EgregiousDelayDP(){
//            return new Object[][]{
//                    {OrderStatus.Status.CONFIRMED,"confirmed","PLACED"},
//                    {OrderStatus.Status.CONFIRMED,"confirmed", "FOOD_PREPARED"},
//                    {OrderStatus.Status.ARRIVED,"arrived","PLACED"},
//                    {OrderStatus.Status.ARRIVED,"arrived", "FOOD_PREPARED"},
//            };
//
//        }

        /**
         * This can be use to map self delivery different delivery and vendor status
         * @return
         */
//        @DataProvider(name = "selfDeliveryWimoDP")
//        public Object[][] selfDeliveryWimoDP(){
//            return new Object[][]{
//                    {UpdateShipmentStatus.ShipmentStatus.ASSIGNED,"confirmed", SelfDeliveryHelpcenterBotConstants.VENDOR_STATUS_FOOD_PREPARED,SelfDeliveryHelpcenterBotConstants.REST_FOOD_PREPARED_DE_ASSIGNED_NO_ETA},
//                    {UpdateShipmentStatus.ShipmentStatus.ASSIGNED,"confirmed",SelfDeliveryHelpcenterBotConstants.VENDOR_STATUS_PLACED,SelfDeliveryHelpcenterBotConstants.REST_CONFIRMED_DE_ASSIGNED_NO_ETA},
//                    {UpdateShipmentStatus.ShipmentStatus.ASSIGNED,"confirmed","",SelfDeliveryHelpcenterBotConstants.REST_NOT_CONFIRMED_DE_ASSIGNED_NO_ETA},
//                    {UpdateShipmentStatus.ShipmentStatus.ARRIVED,"","",SelfDeliveryHelpcenterBotConstants.REST_NOT_CONFIRMED_DE_ARRIVED_NO_ETA},
//                    {UpdateShipmentStatus.ShipmentStatus.ARRIVED,"arrived",SelfDeliveryHelpcenterBotConstants.VENDOR_STATUS_PLACED,SelfDeliveryHelpcenterBotConstants.REST_CONFIRMED_DE_ARRIVED_NOT_ETA},
//                    {UpdateShipmentStatus.ShipmentStatus.ARRIVED,"arrived",SelfDeliveryHelpcenterBotConstants.VENDOR_STATUS_FOOD_PREPARED,SelfDeliveryHelpcenterBotConstants.REST_FOOD_PREPARED_DE_ARRIVED_NO_ETA},
//                    {UpdateShipmentStatus.ShipmentStatus.PICKED_UP,"pickedup","",SelfDeliveryHelpcenterBotConstants.REST_DE_PICKEDUP_NO_ETA},
//                    {UpdateShipmentStatus.ShipmentStatus.REACHED,"reached","",SelfDeliveryHelpcenterBotConstants.REST_DE_REACHED_NO_ETA},
//            };
//        }

        /**
         * This can be use to map self delivery different unassigned delivery status and vendor status
         * @return
         */
//        @DataProvider(name = "selfDeliveryWimoDeUnassignedDP")
//        public Object[][] selfDeliveryWimoDeUnassignedDP(){
//            return new Object[][]{
//                    {"",SelfDeliveryHelpcenterBotConstants.REST_NOT_CONFIRMED_DE_NOT_ASSIGNED_NO_ETA},
//                    {"PLACED",SelfDeliveryHelpcenterBotConstants.REST_CONFIRMED_DE_NOT_ASSIGNED_NO_ETA},
//                    {"FOOD_PREPARED",SelfDeliveryHelpcenterBotConstants.REST_FOOD_PREPARED_DE_NOT_ASSIGNED_NO_ETA},
//            };
//        }


//        @DataProvider(name = "orderStatusDataProvider")
//        public Iterator<Object[]> orderStatusDataProvider(ITestContext context) {
//            String vendorStatus ="placed";
//            ArrayList<String> list = new ArrayList<>();
//            HashMap<String,String[][]> mappings = new HashMap<>();
//            // {flows},{vendorStatus}, {deliveryStatus}
//            mappings.put("case1", new String[][] {{"ONDNeedHelp","OSDNeedHelp","OSDNeedHelp1","ODNeedChat","ODNeedCall"}
//                    ,{"PLACED","UNPLACED","WITH_DE","FOOD_PREPARED","VENDOR_NOT_AVAILABLE"},
//                    {"unassigned","assigned","confirmed","arrived","pickedup","reached"}});
//
//            HashMap<OrderStatus.Status, HelpcenterBotWorkflows[]> cases = new HashMap<>();
//            cases.put(OrderStatus.Status.DELIVERED,new HelpcenterBotWorkflows[]{HelpcenterBotWorkflows.MDI_DE_BRINGING_ORDER,
//                    HelpcenterBotWorkflows.MDI_DE_NOT_REACHABLE,
//                    HelpcenterBotWorkflows.MDI_DE_REFUSING_TO_DELIVER,});
//            ArrayList<Object[]> orderStatusFlow = new ArrayList<Object[]>();
//            for (Map.Entry<OrderStatus.Status, HelpcenterBotWorkflows[]> entry : cases.entrySet()){
//                OrderStatus.Status orderStatus = entry.getKey();
//                HelpcenterBotWorkflows[] useCases = entry.getValue();
//                for (int j = 0; j < useCases.length; j++) {
//                    HashMap<String, String> scenarioData = new HashMap<>();
//                    scenarioData.put("deliveryStatus", orderStatus.toString());
//                    scenarioData.put("vendorStatus", vendorStatus);
//                    scenarioData.put("workflow", useCases[j].toString());
//                    orderStatusFlow.add(new Object[]{scenarioData});
//                }
//            }
//            return orderStatusFlow.iterator();
//        }



        @DataProvider(name = "orderStatusFlow")
        public Iterator<Object[]> orderStatusFlow() {
            ArrayList<Object[]> flowNewOrderStatus = new ArrayList<Object[]>();
            String[] orderDelay= new String[]{"slightlyDelayed","notDelayed","delayed"};
            String[] legWiseDelay = new String[0];
            String messageString = null;
            List<String> legwiseDelayFlows = Arrays.asList(new String[]{
                    "VENDOR_NOT_AVAILABLE_unassigned","FOOD_PREPARED_arrived",
                    "PLACED_arrived", "UNPLACED_arrived", "UNPLACED_confirmed", "UNPLACED_assigned",
                    "FOOD_PREPARED_unassigned","PLACED_unassigned","UNPLACED_unassigned"});
            HashMap<String,String[][]> mappings = new HashMap<>();
            //Order Not delayed Cases -----  First value is the flow list from flow mapper, 2nd is vendor list and 3rd is delivery list
            mappings.put("case1", new String[][] {{"HelpcenterBotWorkflows.WIMO_ORDER_TAKING_TIME_ONTIME_GOT_IT.name()"},
                    {"PLACED","WITH_DE","UNPLACED","FOOD_PREPARED","VENDOR_NOT_AVAILABLE"},
                    {"unassigned","assigned","confirmed","arrived","pickedup","reached"}});

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
                                if ((scenarios[2][k] == "pickedup" || scenarios[2][k] == "reached") &&
                                        (scenarios[1][j] != "PLACED" || scenarios[1][j] != "VENDOR_NOT_AVAILABLE"))
                                    continue;
                                if (legwiseDelayFlows.contains(scenarios[1][j] + "_" + scenarios[2][k]))
                                    legWiseDelay = new String[]{"delayed", "notDelayed"};
                                else
                                    legWiseDelay = new String[]{"notDelayed"};
                                for (int l = 0; l < legWiseDelay.length; l++) {
                                    HashMap<String, String> scenarioData = new HashMap<>();
                                    scenarioData.put("deliveryStatus", scenarios[2][k]);
                                    scenarioData.put("vendorStatus", scenarios[1][j]);
                                    scenarioData.put("flow", scenarios[0][i]);
                                    scenarioData.put("legWiseDelay", legWiseDelay[l]);
                                    String key = scenarios[1][j] + "_" + scenarios[2][k];
                                    scenarioData.put("orderWiseDelay", orderDelay[x]);
                                    key = key + "_" + orderDelay[x];
                                    if (legWiseDelay[l].equals("notDelayed")) {
                                        messageString = "getNotDelayMessages(key)";
                                    } else {
                                        messageString = "getDelayMessages(key)";
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

//        public  String getNotDelayMessages(String flowName){
//            HashMap<String,String> notDelayMessages = new HashMap<>();
//            //Order not confirmed by restaurant, DE not assigned, Order with DE
//            notDelayMessages.put("WITH_DE_unassigned_notDelayed",HelpcenterBotConstants.RX_NOT_COMFIRMED_DE_NOT_ASSIGNED_ORDER_WITH_DE_HAPPY);
//            notDelayMessages.put("WITH_DE_unassigned_slightlyDelayed",HelpcenterBotConstants.RX_NOT_COMFIRMED_DE_NOT_ASSIGNED_ORDER_WITH_DE_SLIGHTLY_DELAY);
//            notDelayMessages.put("WITH_DE_unassigned_delayed",HelpcenterBotConstants.RX_NOT_COMFIRMED_DE_NOT_ASSIGNED_ORDER_WITH_DE_DELAY);
//            //Order not confirmed by restaurant, DE not assigned
//            notDelayMessages.put("UNPLACED_unassigned_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("UNPLACED_unassigned_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("UNPLACED_unassigned_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY);
//            //Order confirmed by restaurant, DE not assigned
//            notDelayMessages.put("PLACED_unassigned_notDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("PLACED_unassigned_slightlyDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("PLACED_unassigned_delayed",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_DELAY);
//            //Food prepared by restaurant, DE not assigned
//            notDelayMessages.put("FOOD_PREPARED_unassigned_notDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("FOOD_PREPARED_unassigned_slightlyDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("FOOD_PREPARED_unassigned_delayed",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_DELAY);
//            //Delivery status = Unassigned and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_notDelayed",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_slightlyDelayed",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_delayed",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_DELAY);
//            //Order not confirmed by restaurant, DE assigned but not confirmed, Order with DE
//            notDelayMessages.put("WITH_DE_assigned_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_ASSIGNED_NOT_CONFIRMED_ORDER_WITH_DE_HAPPY);
//            notDelayMessages.put("WITH_DE_assigned_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_ASSIGNED_NOT_CONFIRMED_ORDER_WITH_DE_SLIGHTLY_DELAY);
//            notDelayMessages.put("WITH_DE_assigned_delayed",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_ASSIGNED_NOT_CONFIRMED_ORDER_WITH_DE_DELAY);
//            //Order not confirmed by restaurant, DE assigned but not confirmed
//            notDelayMessages.put("UNPLACED_assigned_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("UNPLACED_assigned_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("UNPLACED_assigned_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY);
//            //Order confirmed by restaurant, DE assigned but not confirmed
//            notDelayMessages.put("PLACED_assigned_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_HAPPY);
//            notDelayMessages.put("PLACED_assigned_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_SLIGHTLY_DELAY);
//            notDelayMessages.put("PLACED_assigned_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_DELAY);
//            //Food prepared by restaurant, DE assigned but not confirmed
//            notDelayMessages.put("FOOD_PREPARED_assigned_notDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ASSIGNED_NOT_CONFIRMED_HAPPY);
//            notDelayMessages.put("FOOD_PREPARED_assigned_slightlyDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ASSIGNED_NOT_CONFIRMED_SLIGHTLY_DELAY);
//            notDelayMessages.put("FOOD_PREPARED_assigned_delayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ASSIGNED_NOT_CONFIRMED_DELAY);
//            //Delivery status = Assigned but not confirmed and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_assigned_notDelayed",HelpcenterBotConstants.DE_ASSIGNED_NOT_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_HAPPY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_assigned_slightlyDelayed",HelpcenterBotConstants.DE_ASSIGNED_NOT_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_SLIGHTLY_DELAY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_assigned_delayed",HelpcenterBotConstants.DE_ASSIGNED_NOT_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_DELAY);
//            //Order not confirmed by restaurant, DE confirmed but not arrived at restaurant, Order with DE
//            notDelayMessages.put("WITH_DE_confirmed_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_CONFIMRED_NOT_ARRIVED_ORDER_WITH_DE_HAPPY);
//            notDelayMessages.put("WITH_DE_confirmed_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_CONFIMRED_NOT_ARRIVED_ORDER_WITH_DE_SLIGHTLY_DELAY);
//            notDelayMessages.put("WITH_DE_confirmed_delayed",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_CONFIMRED_NOT_ARRIVED_ORDER_WITH_DE_DELAY);
//            //Order not confirmed by restaurant, DE confirmed but not arrived at restaurant
//            notDelayMessages.put("UNPLACED_confirmed_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("UNPLACED_confirmed_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("UNPLACED_confirmed_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY);
//            //Order confirmed by restaurant, DE confirmed but not arrived at restaurant
//            notDelayMessages.put("PLACED_confirmed_notDelayed",HelpcenterBotConstants.RX_DE_CONFIRMED_NOT_ARRIVED_HAPPY);
//            notDelayMessages.put("PLACED_confirmed_slightlyDelayed",HelpcenterBotConstants.RX_DE_CONFIRMED_NOT_ARRIVED_SLIGHTLY_DELAY);
//            notDelayMessages.put("PLACED_confirmed_delayed",HelpcenterBotConstants.RX_DE_CONFIRMED_NOT_ARRIVED_DELAY);
//            //Food prepared by restaurant, DE confirmed but not arrived at restaurant
//            notDelayMessages.put("FOOD_PREPARED_confirmed_notDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_CONFIRMED_NOT_ARRIVED_HAPPY);
//            notDelayMessages.put("FOOD_PREPARED_confirmed_slightlyDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_CONFIRMED_NOT_ARRIVED_SLIGHTLY_DELAY);
//            notDelayMessages.put("FOOD_PREPARED_confirmed_delayed",HelpcenterBotConstants.FOOD_PREPARED_DE_CONFIRMED_NOT_ARRIVED_DELAY);
//            //Delivery status = Confirmed and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_confirmed_notDelayed",HelpcenterBotConstants.DE_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_HAPPY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_confirmed_slightlyDelayed",HelpcenterBotConstants.DE_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_SLIGHTLY_DELAY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_confirmed_delayed",HelpcenterBotConstants.DE_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_DELAY);
//            //Order not confirmed by restaurant, DE arrived at restaurant, Order with DE
//            notDelayMessages.put("WITH_DE_arrived_notDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_ORDER_WITH_DE_HAPPY);
//            notDelayMessages.put("WITH_DE_arrived_slightlyDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_ORDER_WITH_DE_SLIGHTLY_DELAY);
//            notDelayMessages.put("WITH_DE_arrived_delayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_ORDER_WITH_DE_DELAY);
//            //Order not confirmed by restaurant, DE arrived at restaurant
//            notDelayMessages.put("UNPLACED_arrived_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("UNPLACED_arrived_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("UNPLACED_arrived_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY);
//            //Order confirmed by restaurant, DE arrived but not yet picked up
//            notDelayMessages.put("PLACED_arrived_notDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("PLACED_arrived_slightlyDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("PLACED_arrived_delayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_DELAY);
//            //Food prepared by restaurant, DE arrived but not yet picked up
//            notDelayMessages.put("FOOD_PREPARED_arrived_notDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_HAPPY);
//            notDelayMessages.put("FOOD_PREPARED_arrived_slightlyDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY);
//            notDelayMessages.put("FOOD_PREPARED_arrived_delayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_DELAY);
//            //Delivery status = Arrived and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_arrived_notDelayed",HelpcenterBotConstants.DE_ARRIVED_VENDOR_STATUS_NOT_AVAILABLE_HAPPY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_arrived_slightlyDelayed",HelpcenterBotConstants.DE_ARRIVED_VENDOR_STATUS_NOT_AVAILABLE_SLIGHTLY_DELAY);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_arrived_delayed",HelpcenterBotConstants.DE_ARRIVED_VENDOR_STATUS_NOT_AVAILABLE_DELAY);
//            //Order picked up by DE, not yet reached at customer location
//            notDelayMessages.put("FOOD_PREPARED_pickedup_notDelayed",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_HAPPY);
//            notDelayMessages.put("FOOD_PREPARED_pickedup_slightlyDelayed",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_SLIGHTLY_DELAY);
//            notDelayMessages.put("FOOD_PREPARED_pickedup_delayed",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_DELAY);
//
//            notDelayMessages.put("FOOD_PREPARED_reached_notDelayed",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_HAPPY);
//            notDelayMessages.put("FOOD_PREPARED_reached_slightlyDelayed",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_SLIGHTLY_DELAY);
//            notDelayMessages.put("FOOD_PREPARED_reached_delayed",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_DELAY);
//
//            //Parked Vendor Status
//            notDelayMessages.put("PARKED_unassigned_notDelayed_CDC_RELAY_DELAY",HelpcenterBotConstants.REGULAR_ORDER_PARKED_DE_UNASSIGNED_HAPPY);
//            notDelayMessages.put("PARKED_unassigned_slightlyDelayed_CDC_RELAY_DELAY",HelpcenterBotConstants.REGULAR_ORDER_PARKED_DE_UNASSIGNED_SLIGHTLY_DELAYED);
//            notDelayMessages.put("PARKED_unassigned_delayed_CDC_RELAY_DELAY",HelpcenterBotConstants.REGULAR_ORDER_PARKED_DE_UNASSIGNED_DELAYED);
//
//            notDelayMessages.put("PARKED_unassigned_notDelayed_PRE_ORDER_RELAY_DELAY",HelpcenterBotConstants.PRE_ORDER_PARKED_DE_UNASSIGNED_HAPPY);
//            notDelayMessages.put("PARKED_unassigned_slightlyDelayed_PRE_ORDER_RELAY_DELAY",HelpcenterBotConstants.PRE_ORDER_PARKED_DE_UNASSIGNED_SLIGHTLY_DELAYED);
//            notDelayMessages.put("PARKED_unassigned_delayed_PRE_ORDER_RELAY_DELAY",HelpcenterBotConstants.PRE_ORDER_PARKED_DE_UNASSIGNED_DELAYED);
//
//            return notDelayMessages.get(flowName);
//
//        }
//
//        public  String getDelayMessages(String flowName){
//            HashMap<String,String> delayMessages = new HashMap<>();
//            //Order not confirmed by restaurant, DE not assigned
//            delayMessages.put("UNPLACED_unassigned_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("UNPLACED_unassigned_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("UNPLACED_unassigned_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY);
//            //Delivery status = Unassigned and Vendor Status Not available
//            delayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_notDelayed",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_slightlyDelayed",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_delayed",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_DELAY);
//            //Order not confirmed by restaurant, DE assigned but not confirmed
//            delayMessages.put("UNPLACED_assigned_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("UNPLACED_assigned_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("UNPLACED_assigned_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY);
//            //Food prepared by restaurant, DE not assigned
//            delayMessages.put("FOOD_PREPARED_unassigned_notDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("FOOD_PREPARED_unassigned_slightlyDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("FOOD_PREPARED_unassigned_delayed",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_DELAY);
//            //Order confirmed by restaurant, DE not assigned
//            delayMessages.put("PLACED_unassigned_notDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("PLACED_unassigned_slightlyDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("PLACED_unassigned_delayed",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_DELAY);
//            //Order not confirmed by restaurant, DE confirmed but not arrived at restaurant
//            delayMessages.put("UNPLACED_confirmed_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("UNPLACED_confirmed_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("UNPLACED_confirmed_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY);
//
//            //Order not confirmed by restaurant, DE arrived at restaurant
//            delayMessages.put("UNPLACED_arrived_notDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("UNPLACED_arrived_slightlyDelayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("UNPLACED_arrived_delayed",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY);
//            //Order confirmed by restaurant, DE arrived but not yet picked up
//            delayMessages.put("PLACED_arrived_notDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("PLACED_arrived_slightlyDelayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("PLACED_arrived_delayed",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_DELAY);
//            //Food prepared by restaurant, DE arrived but not yet picked up
//            delayMessages.put("FOOD_PREPARED_arrived_notDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_HAPPY);
//            delayMessages.put("FOOD_PREPARED_arrived_slightlyDelayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY);
//            delayMessages.put("FOOD_PREPARED_arrived_delayed",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_DELAY);
//
//            //Order picked up by DE, not yet reached at customer location
//            delayMessages.put("FOOD_PREPARED_pickedup_notDelayed",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_HAPPY);
//            delayMessages.put("FOOD_PREPARED_pickedup_slightlyDelayed",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_SLIGHTLY_DELAY);
//            delayMessages.put("FOOD_PREPARED_pickedup_delayed",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_DELAY);
//
//            //Order reached up by DE, not yet delivered
//            delayMessages.put("FOOD_PREPARED_reached_notDelayed",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_HAPPY);
//            delayMessages.put("FOOD_PREPARED_reached_slightlyDelayed",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_SLIGHTLY_DELAY);
//            delayMessages.put("FOOD_PREPARED_reached_delayed",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_DELAY);
//
//            //Parked Vendor Status
//            delayMessages.put("PARKED_unassigned_notDelayed_CDC_RELAY_DELAY",HelpcenterBotConstants.REGULAR_ORDER_PARKED_DE_UNASSIGNED_HAPPY);
//            delayMessages.put("PARKED_unassigned_slightlyDelayed_CDC_RELAY_DELAY",HelpcenterBotConstants.REGULAR_ORDER_PARKED_DE_UNASSIGNED_SLIGHTLY_DELAYED);
//            delayMessages.put("PARKED_unassigned_delayed_CDC_RELAY_DELAY",HelpcenterBotConstants.REGULAR_ORDER_PARKED_DE_UNASSIGNED_DELAYED);
//
//            delayMessages.put("PARKED_unassigned_notDelayed_PRE_ORDER_RELAY_DELAY",HelpcenterBotConstants.PRE_ORDER_PARKED_DE_UNASSIGNED_HAPPY);
//            delayMessages.put("PARKED_unassigned_slightlyDelayed_PRE_ORDER_RELAY_DELAY",HelpcenterBotConstants.PRE_ORDER_PARKED_DE_UNASSIGNED_SLIGHTLY_DELAYED);
//            delayMessages.put("PARKED_unassigned_delayed_PRE_ORDER_RELAY_DELAY",HelpcenterBotConstants.PRE_ORDER_PARKED_DE_UNASSIGNED_DELAYED);
//
//            return delayMessages.get(flowName);
//
//        }
//
//        @DataProvider(name = "orderStatusFlowWithoutETA")
//        public Iterator<Object[]> orderStatusFlowWithoutETA() {
//            ArrayList<Object[]> flowNewOrderStatus = new ArrayList<Object[]>();
//            String[] orderDelay= new String[]{"notDelayed","slightlyDelayed","delayed"};
//            String[] legWiseDelay = new String[0];
//            String messageString = null;
//            List<String> legwiseDelayFlows = Arrays.asList(new String[]{
//                    "VENDOR_NOT_AVAILABLE_unassigned","FOOD_PREPARED_arrived",
//                    "PLACED_arrived", "UNPLACED_arrived", "UNPLACED_confirmed", "UNPLACED_assigned",
//                    "FOOD_PREPARED_unassigned","PLACED_unassigned","UNPLACED_unassigned"});
//            HashMap<String,String[][]> mappings = new HashMap<>();
//            //Order Not delayed Cases -----  First value is the flow list from flow mapper, 2nd is vendor list and 3rd is delivery list
//            mappings.put("case1", new String[][] {{HelpcenterBotWorkflows.WIMO_ORDER_TAKING_TIME_ONTIME_GOT_IT.name()},
//                    {"UNPLACED","PLACED","WITH_DE","FOOD_PREPARED","VENDOR_NOT_AVAILABLE"},
//                    {"unassigned","assigned","confirmed","arrived","pickedup","reached"}});
//
//            Iterator<Map.Entry<String, String[][]>> itr = mappings.entrySet().iterator();
//            System.out.println("itr "+itr);
//            while (itr.hasNext()) {
//                Map.Entry<String, String[][]> entry = itr.next();
//                System.out.println("entry "+entry);
//                String scenarios[][] = entry.getValue();
//                //Loop through the first list of valid flows
//                for(int i=0;i<scenarios[0].length;i++) {
//                    //Loop through the second list of vendor status
//                    for (int j = 0; j < scenarios[1].length; j++) {
//                        //Loop through the third list of delivery status
//                        for (int k = 0; k < scenarios[2].length; k++) {
//                            for (int x = 0; x <orderDelay.length; x++) {
//                                if ((scenarios[2][k] == "pickedup" || scenarios[2][k] == "reached") &&
//                                        (scenarios[1][j] != "PLACED" || scenarios[1][j] != "VENDOR_NOT_AVAILABLE"))
//                                    continue;
//                                if (legwiseDelayFlows.contains(scenarios[1][j] + "_" + scenarios[2][k]))
//                                    legWiseDelay = new String[]{"delayed", "notDelayed"};
//                                else
//                                    legWiseDelay = new String[]{"notDelayed"};
//                                for (int l = 0; l < legWiseDelay.length; l++) {
//                                    HashMap<String, String> scenarioData = new HashMap<>();
//                                    scenarioData.put("deliveryStatus", scenarios[2][k]);
//                                    scenarioData.put("vendorStatus", scenarios[1][j]);
//                                    scenarioData.put("flow", scenarios[0][i]);
//                                    scenarioData.put("legWiseDelay", legWiseDelay[l]);
//                                    String key = scenarios[1][j] + "_" + scenarios[2][k];
//                                    scenarioData.put("orderWiseDelay", orderDelay[x]);
//                                    key = key + "_" + orderDelay[x] + "_" + "NO_ETA";
//                                    if (legWiseDelay[l].equals("notDelayed")) {
//                                        messageString = getNotDelayMessagesWithoutETA(key);
//                                    } else {
//                                        messageString = getDelayMessagesWithoutETA(key);
//                                    }
//                                    scenarioData.put("messageString", messageString);
//                                    flowNewOrderStatus.add(new Object[]{scenarioData});
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            return flowNewOrderStatus.iterator();
//        }
//
//        public  String getNotDelayMessagesWithoutETA(String flowName){
//            HashMap<String,String> notDelayMessages = new HashMap<>();
//            //Order not confirmed by restaurant, DE not assigned, Order with DE
//            notDelayMessages.put("WITH_DE_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_COMFIRMED_DE_NOT_ASSIGNED_ORDER_WITH_DE_HAPPY_NO_ETA);
//            notDelayMessages.put("WITH_DE_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_COMFIRMED_DE_NOT_ASSIGNED_ORDER_WITH_DE_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("WITH_DE_unassigned_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_COMFIRMED_DE_NOT_ASSIGNED_ORDER_WITH_DE_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE not assigned
//            notDelayMessages.put("UNPLACED_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("UNPLACED_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("UNPLACED_unassigned_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Order confirmed by restaurant, DE not assigned
//            notDelayMessages.put("PLACED_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("PLACED_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("PLACED_unassigned_delayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Food prepared by restaurant, DE not assigned
//            notDelayMessages.put("FOOD_PREPARED_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_unassigned_delayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Delivery status = Unassigned and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_delayed_NO_ETA",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE assigned but not confirmed, Order with DE
//            notDelayMessages.put("WITH_DE_assigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_ASSIGNED_NOT_CONFIRMED_ORDER_WITH_DE_HAPPY_NO_ETA);
//            notDelayMessages.put("WITH_DE_assigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_ASSIGNED_NOT_CONFIRMED_ORDER_WITH_DE_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("WITH_DE_assigned_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_ASSIGNED_NOT_CONFIRMED_ORDER_WITH_DE_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE assigned but not confirmed
//            notDelayMessages.put("UNPLACED_assigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("UNPLACED_assigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("UNPLACED_assigned_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Order confirmed by restaurant, DE assigned but not confirmed
//            notDelayMessages.put("PLACED_assigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_HAPPY_NO_ETA);
//            notDelayMessages.put("PLACED_assigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("PLACED_assigned_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_DELAY_NO_ETA);
//            //Food prepared by restaurant, DE assigned but not confirmed
//            notDelayMessages.put("FOOD_PREPARED_assigned_notDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ASSIGNED_NOT_CONFIRMED_HAPPY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_assigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ASSIGNED_NOT_CONFIRMED_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_assigned_delayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ASSIGNED_NOT_CONFIRMED_DELAY_NO_ETA);
//            //Delivery status = Assigned but not confirmed and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_assigned_notDelayed_NO_ETA",HelpcenterBotConstants.DE_ASSIGNED_NOT_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_HAPPY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_assigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.DE_ASSIGNED_NOT_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_assigned_delayed_NO_ETA",HelpcenterBotConstants.DE_ASSIGNED_NOT_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE confirmed but not arrived at restaurant, Order with DE
//            notDelayMessages.put("WITH_DE_confirmed_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_CONFIMRED_NOT_ARRIVED_ORDER_WITH_DE_HAPPY_NO_ETA);
//            notDelayMessages.put("WITH_DE_confirmed_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_CONFIMRED_NOT_ARRIVED_ORDER_WITH_DE_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("WITH_DE_confirmed_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIMRED_DE_CONFIMRED_NOT_ARRIVED_ORDER_WITH_DE_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE confirmed but not arrived at restaurant
//            notDelayMessages.put("UNPLACED_confirmed_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("UNPLACED_confirmed_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("UNPLACED_confirmed_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Order confirmed by restaurant, DE confirmed but not arrived at restaurant
//            notDelayMessages.put("PLACED_confirmed_notDelayed_NO_ETA",HelpcenterBotConstants.RX_DE_CONFIRMED_NOT_ARRIVED_HAPPY_NO_ETA);
//            notDelayMessages.put("PLACED_confirmed_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_DE_CONFIRMED_NOT_ARRIVED_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("PLACED_confirmed_delayed_NO_ETA",HelpcenterBotConstants.RX_DE_CONFIRMED_NOT_ARRIVED_DELAY_NO_ETA);
//            //Food prepared by restaurant, DE confirmed but not arrived at restaurant
//            notDelayMessages.put("FOOD_PREPARED_confirmed_notDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_CONFIRMED_NOT_ARRIVED_HAPPY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_confirmed_slightlyDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_CONFIRMED_NOT_ARRIVED_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_confirmed_delayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_CONFIRMED_NOT_ARRIVED_DELAY_NO_ETA);
//            //Delivery status = Confirmed and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_confirmed_notDelayed_NO_ETA",HelpcenterBotConstants.DE_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_HAPPY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_confirmed_slightlyDelayed_NO_ETA",HelpcenterBotConstants.DE_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_confirmed_delayed_NO_ETA",HelpcenterBotConstants.DE_CONFIRMED_VENDOR_STATUS_NOT_AVAILABLE_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE arrived at restaurant, Order with DE
//            notDelayMessages.put("WITH_DE_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_ORDER_WITH_DE_HAPPY_NO_ETA);
//            notDelayMessages.put("WITH_DE_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_ORDER_WITH_DE_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("WITH_DE_arrived_delayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_ORDER_WITH_DE_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE arrived at restaurant
//            notDelayMessages.put("UNPLACED_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("UNPLACED_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("UNPLACED_arrived_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Order confirmed by restaurant, DE arrived but not yet picked up
//            notDelayMessages.put("PLACED_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("PLACED_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("PLACED_arrived_delayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Food prepared by restaurant, DE arrived but not yet picked up
//            notDelayMessages.put("FOOD_PREPARED_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_HAPPY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("FOOD_PREPARED_arrived_delayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_LESS_THAN_NOW_DELAY_NO_ETA);
//            //Delivery status = Arrived and Vendor Status Not available
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.DE_ARRIVED_VENDOR_STATUS_NOT_AVAILABLE_HAPPY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.DE_ARRIVED_VENDOR_STATUS_NOT_AVAILABLE_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("VENDOR_NOT_AVAILABLE_arrived_delayed_NO_ETA",HelpcenterBotConstants.DE_ARRIVED_VENDOR_STATUS_NOT_AVAILABLE_DELAY_NO_ETA);
//            //Order picked up by DE, not yet reached at customer location
//            notDelayMessages.put("PLACED_pickedup_notDelayed_NO_ETA",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_HAPPY_NO_ETA);
//            notDelayMessages.put("PLACED_pickedup_slightlyDelayed_NO_ETA",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("PLACED_pickedup_delayed_NO_ETA",HelpcenterBotConstants.DE_PICKED_UP_NOT_REACHED_DELAY_NO_ETA);
//
//            notDelayMessages.put("PLACED_reached_notDelayed_NO_ETA",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_HAPPY_NO_ETA);
//            notDelayMessages.put("PLACED_reached_slightlyDelayed_NO_ETA",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED_SLIGHTLY_DELAY_NO_ETA);
//            notDelayMessages.put("PLACED_reached_delayed_NO_ETA",HelpcenterBotConstants.DE_REACHED_NOT_DELIVERED__DELAY_NO_ETA);
//            return notDelayMessages.get(flowName);
//        }
//
//        public  String getDelayMessagesWithoutETA(String flowName){
//            HashMap<String,String> delayMessages = new HashMap<>();
//            //Order not confirmed by restaurant, DE not assigned
//            delayMessages.put("UNPLACED_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("UNPLACED_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("UNPLACED_unassigned_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_NOT_ASSIGNED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            //Delivery status = Unassigned and Vendor Status Not available
//            delayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("VENDOR_NOT_AVAILABLE_unassigned_delayed_NO_ETA",HelpcenterBotConstants.DE_UNASSIGNED_VENDOR_STATUS_NOT_AVAILABLE_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE assigned but not confirmed
//            delayMessages.put("UNPLACED_assigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("UNPLACED_assigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("UNPLACED_assigned_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ASSIGNED_NOT_CONFIMRED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            //Food prepared by restaurant, DE not assigned
//            delayMessages.put("FOOD_PREPARED_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("FOOD_PREPARED_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("FOOD_PREPARED_unassigned_delayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            //Order confirmed by restaurant, DE not assigned
//            delayMessages.put("PLACED_unassigned_notDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("PLACED_unassigned_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("PLACED_unassigned_delayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_NOT_ASSIGNED_DE_ASSIGNMENT_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            //Order not confirmed by restaurant, DE confirmed but not arrived at restaurant
//            delayMessages.put("UNPLACED_confirmed_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("UNPLACED_confirmed_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("UNPLACED_confirmed_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_CONFIRMED_NOT_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//
//            //Order not confirmed by restaurant, DE arrived at restaurant
//            delayMessages.put("UNPLACED_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("UNPLACED_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("UNPLACED_arrived_delayed_NO_ETA",HelpcenterBotConstants.RX_NOT_CONFIRMED_DE_ARRIVED_PLACEMENT_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            //Order confirmed by restaurant, DE arrived but not yet picked up
//            delayMessages.put("PLACED_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("PLACED_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("PLACED_arrived_delayed_NO_ETA",HelpcenterBotConstants.RX_CONFIRMED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            //Food prepared by restaurant, DE arrived but not yet picked up
//            delayMessages.put("FOOD_PREPARED_arrived_notDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_HAPPY_NO_ETA);
//            delayMessages.put("FOOD_PREPARED_arrived_slightlyDelayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_SLIGHTLY_DELAY_NO_ETA);
//            delayMessages.put("FOOD_PREPARED_arrived_delayed_NO_ETA",HelpcenterBotConstants.FOOD_PREPARED_DE_ARRIVED_NOT_PICKED_UP_DE_PICK_UP_TIME_MORE_THAN_NOW_DELAY_NO_ETA);
//            return delayMessages.get(flowName);
//        }
//
//        /**
//         * This can be use to map Mid GD Bau child nodes test data
//         * @return
//         */
//        @DataProvider(name = "MidGdBauDp")
//        public Object[][] MidGdBauDp(){
//            return new Object[][]{
//                    {"confirmed","UNPLACED","notDelayed","notDelayed",HelpcenterBotConstants.MID_GD_BAU_ORDER_NOT_CONFIRMED_BY_RESTAURANT,HelpcenterBotConstants.MID_GD_BAU_ORDER_NOT_CONFIRMED_BY_RESTAURANT_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_UNASSIGNED_UNPLACED},
//                    {"pickedup","FOOD_PREPARED","delayed","delayed",HelpcenterBotConstants.MID_GD_BAU_ORDER_TAKING_TOO_LONG_TO_DELIVER,HelpcenterBotConstants.MID_GD_BAU_I_AM_UNABLE_TO_TRACK_DE_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_ORDER_TAKE_TOO_LONG_TO_DELIVER},
//                    {"reached","FOOD_PREPARED","notDelayed","notDelayed",HelpcenterBotConstants.MID_GD_BAU_ORDER_FOOD_PREPARED_PICKEDUP_DE_MOVING_WRONG_DIRECTION,HelpcenterBotConstants.MID_GD_BAU_I_AM_UNABLE_TO_TRACK_DE_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_PICKEDUP_DE_MOVING_WRONG_DIRECTION},
//                    {"pickedup","FOOD_PREPARED","notDelayed","notDelayed",HelpcenterBotConstants.MID_GD_BAU_ORDER_FOOD_PREPARED_PICKEDUP_DE_MOVING_WRONG_DIRECTION,HelpcenterBotConstants.MID_GD_BAU_I_AM_UNABLE_TO_TRACK_DE_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_PICKEDUP_DE_MOVING_WRONG_DIRECTION},
//                    {"pickedup","FOOD_PREPARED","notDelayed","notDelayed",HelpcenterBotConstants.MID_GD_BAU_ORDER_FOOD_PREPARED_PICKEDUP,HelpcenterBotConstants.MID_GD_BAU_PICKEDUP_DE_NOT_MOVING_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_PICKEDUP_FOOD_PREPARED},
//                    {"arrived","FOOD_PREPARED","notDelayed","notDelayed",HelpcenterBotConstants.MID_GD_BAU_ORDER_PLACED_ARRIVED,HelpcenterBotConstants.MID_GD_BAU_I_AM_UNABLE_TO_TRACK_DE_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_ARRIVED_PLACED},
//                    {"confirmed","PLACED","notDelayed","notDelayed",HelpcenterBotConstants.MID_GD_BAU_ORDER_PLACED_CONFIRMED,HelpcenterBotConstants.MID_GD_BAU_I_AM_UNABLE_TO_TRACK_DE_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_CONFIRMED_PLACED},
//                    {"assigned","PLACED","notDelayed","notDelayed",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_PLACED_L2_TITEL,HelpcenterBotConstants.MID_GD_BAU_ASSIGNED_PLACED_NODES,HelpcenterBotWorkflows.WIMO_ORDER_MID_GD_BAU_ASSIGNED_PLACED}
//            };
//        }
//
//        /**
//         * This can be use to map Mid GD Bau L2 nodes test data
//         * @return
//         */
//        @DataProvider(name = "MidGd")
//        public Iterator<Object[]> MidGd() {
//            ArrayList finalData = new ArrayList();
//            String messageString =  null;
//            HashMap<String, String[][]> mapping = new HashMap<>();
//            mapping.put("case1", new String[][]{{"confirmed","arrived","unassigned","assigned"},{
//                    "VENDOR_NOT_AVAILABLE","FOOD_PREPARED","PLACED","WITH_DE","PLACED","UNPLACED"},
//                    {"notDelayed","delayed"},
//                    {"delayed","notDelayed","slightlyDelayed"}});
//            mapping.put("case2", new String[][]{{"pickedup","reached"},
//                    {"FOOD_PREPARED"},
//                    {"notDelayed","delayed"},
//                    {"delayed","notDelayed","slightlyDelayed"}});
//            Iterator<Map.Entry<String, String[][]>> itr = mapping.entrySet().iterator();
//            while (itr.hasNext()) {
//                Map.Entry<String, String[][]> entry = itr.next();
//                String scenarios[][] = entry.getValue();
//
//                for (int i = 0; i < scenarios[0].length; i++) {
//                    for (int j = 0; j < scenarios[1].length; j++) {
//                        for (int k = 0; k < scenarios[2].length; k++) {
//                            for (int l = 0; l < scenarios[3].length; l++) {
//                                HashMap<String, String> data = new HashMap<>();
//                                data.put("deliveryStatus", scenarios[0][i]);
//                                data.put("vendorStatus", scenarios[1][j]);
//                                data.put("legWiseDelayType", scenarios[2][k]);
//                                data.put("orderWiseDelay", scenarios[3][l]);
//                                String key = scenarios[0][i] + "_" + scenarios[1][j];
//                                if ((scenarios[3][l].equals("notDelayed")) || (scenarios[3][l].equals("slightlyDelayed"))) {
//                                    messageString = getNotDelayedL2Nodes(key);
//                                } else {
//                                    messageString = getDelayedL2Nodes(key);
//                                }
//                                data.put("messageString", messageString);
//                                finalData.add(new Object[]{data});
//                            }
//                        }
//                    }
//                }
//            }
//            System.out.println("Total combination:" + finalData.size());
//            return finalData.iterator();
//        }
//
//        public String getNotDelayedL2Nodes(String flowName){
//            HashMap<String,String> l2NodeMessages = new HashMap<>();
//            l2NodeMessages.put("unassigned_PLACED",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_PLACED_L2_TITEL);
//            l2NodeMessages.put("unassigned_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("unassigned_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("unassigned_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("assigned_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("assigned_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("assigned_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("assigned_PLACED",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_PLACED_L2_TITEL);
//            l2NodeMessages.put("confirmed_PLACED",HelpcenterBotConstants.MID_GD_BAU_DE_CONFIRMED_PLACED_L2_TITLE);
//            l2NodeMessages.put("arrived_PLACED",HelpcenterBotConstants.MID_GD_BAU_DE_CONFIRMED_PLACED_L2_TITLE);
//            l2NodeMessages.put("unassigned_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_PLACED_L2_TITEL);
//            l2NodeMessages.put("assigned_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_UNASSIGNED_PLACED_L2_TITEL);
//            l2NodeMessages.put("confirmed_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_CONFIRMED_PLACED_L2_TITLE);
//            l2NodeMessages.put("pickedup_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_PICKEDUP_FOOD_PREPARED_L2_TITLE);
//            l2NodeMessages.put("reached_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_PICKEDUP_FOOD_PREPARED_L2_TITLE);
//            l2NodeMessages.put("arrived_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("confirmed_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("arrived_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("arrived_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("confirmed_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("confirmed_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_UNPLACED_L2_TITLE);
//            l2NodeMessages.put("arrived_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_FOOD_PREPARED);
//            return l2NodeMessages.get(flowName);
//        }
//
//        public String getDelayedL2Nodes(String flowName){
//            HashMap<String,String> l2NodeMessages = new HashMap<>();
//            l2NodeMessages.put("unassigned_PLACED",HelpcenterBotConstants.MID_GD_BAU_DE_UNASSIGNED_PLACED_DELAYED);
//            l2NodeMessages.put("unassigned_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_UNASSIGNED_PLACED_DELAYED);
//            l2NodeMessages.put("assigned_PLACED",HelpcenterBotConstants.MID_GD_BAU_DE_UNASSIGNED_PLACED_DELAYED);
//            l2NodeMessages.put("assigned_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_UNASSIGNED_PLACED_DELAYED);
//            l2NodeMessages.put("unassigned_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_VENDOR_NOT_PLACED_UNASSIGNED);
//            l2NodeMessages.put("unassigned_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_VENDOR_NOT_PLACED_UNASSIGNED);
//            l2NodeMessages.put("unassigned_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_VENDOR_NOT_PLACED_UNASSIGNED);
//            l2NodeMessages.put("assigned_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_VENDOR_NOT_PLACED_UNASSIGNED);
//            l2NodeMessages.put("assigned_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_VENDOR_NOT_PLACED_UNASSIGNED);
//            l2NodeMessages.put("assigned_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_VENDOR_NOT_PLACED_UNASSIGNED);
//            l2NodeMessages.put("confirmed_PLACED",HelpcenterBotConstants.MID_GD_BAU_VENDOR_CONFIRMED_DE_CONFIRMED_ARRIVED_DELAYED);
//            l2NodeMessages.put("arrived_PLACED",HelpcenterBotConstants.MID_GD_BAU_VENDOR_CONFIRMED_DE_CONFIRMED_ARRIVED_DELAYED);
//            l2NodeMessages.put("confirmed_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_VENDOR_CONFIRMED_DE_CONFIRMED_ARRIVED_DELAYED);
//            l2NodeMessages.put("pickedup_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_PICKEDUP_FOOD_PREPARED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("reached_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_PICKEDUP_FOOD_PREPARED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("arrived_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_PLACED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("confirmed_WITH_DE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_PLACED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("arrived_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_PLACED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("arrived_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_PLACED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("confirmed_VENDOR_NOT_AVAILABLE",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_PLACED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("confirmed_UNPLACED",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_PLACED_L2_TITLE_DELAYED);
//            l2NodeMessages.put("arrived_FOOD_PREPARED",HelpcenterBotConstants.MID_GD_BAU_DE_ARRIVED_FOOD_PREPARED_DELAYED);
//            return l2NodeMessages.get(flowName);
//        }
//    }

}
