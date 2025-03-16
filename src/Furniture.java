public class Furniture implements FurnitureIntf{
    private String name;
    private String type;
    private Double size;

    public Furniture(String name, String type, double size){
        this.name = name;
        this.type=type;
        this.size=size;
    }

    @Override
    public double accept(ShipmentCalc calc, double distance) {
        return calc.compute(size, distance);
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }
}
