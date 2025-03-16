public class ECommerce {
    public static void main(String[] args){
        System.out.println("E-Commerce: Shipping Cost Calculations\n");

        Furniture diningChair = new Furniture("Dining Chair","Chair", 36);
        Furniture kitchenChair = new Furniture("Kitchen Chair","Chair", 19);
        Furniture diningTable = new Furniture("Dining Table","Table", 72);
        Furniture bedroomTable = new Furniture("Bedroom Table", "Table", 32);
        Furniture livingRoomSofa = new Furniture("Lving Room Sofa", "Sofa", 76);
        Furniture loversSofa = new Furniture("Lover's Sofa","Sofa", 56);

        

        System.out.println("The " + diningChair.getName()  + " will be shipped and will travel 3 kilometers." +
                            "\n\tIts shipping fee will cost " + getShippingCost(diningChair, 3) +"PHP\n");
        System.out.println("The " + kitchenChair.getName()  + " will be shipped and will travel 3 kilometers." +
                            "\n\tIts shipping fee will cost " + getShippingCost(kitchenChair, 3) +"PHP\n");
        System.out.println("The " + diningTable.getName()  + " will be shipped and will travel 10 kilometers." +
                            "\n\tIts shipping fee will cost " + getShippingCost(diningTable, 10) +"PHP\n");
        System.out.println("The " + bedroomTable.getName()  + " will be shipped and will travel 0.5 kilometers." +
                            "\n\tIts shipping fee will cost " + getShippingCost(bedroomTable, 0.5) +"PHP\n");
        System.out.println("The " + livingRoomSofa.getName()  + " will be shipped and will travel 9 kilometers." +
                            "\n\tIts shipping fee will cost " + getShippingCost(livingRoomSofa, 9) +"PHP\n");
        System.out.println("The " + loversSofa.getName()  + " will be shipped and will travel 3 kilometers." +
                            "\n\tIts shipping fee will cost " + getShippingCost(loversSofa, 3) +"PHP\n");
    }

    static double getShippingCost(Furniture furniture, double distance){
        ShipmentCalc calc = null;

        switch (furniture.getType()) {
            case "Chair": calc = new ChairCalc();
                break;
        
            case "Table": calc = new TableCalc();
                break;

            case "Sofa": calc = new SofaCalc();
                break;

        }

        return furniture.accept(calc, distance);
    }
}
