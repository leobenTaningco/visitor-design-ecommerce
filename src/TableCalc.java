import java.util.HashMap;
import java.util.Map;

public class TableCalc implements ShipmentCalc{
    private static Map<String, Double> sizeChart = new HashMap<>();
    static {
        sizeChart.put("small", 50.0);
        sizeChart.put("medium", 70.0);
        sizeChart.put("large", 90.0);
    }

    @Override
    public double compute(double size, double distance) {
        String category = "";

        if(size <=36.0){
            category = "small";
        }
        else if(size > 37.0 && size < 50.0){
            category = "medium";
        }
        else{
            category = "large";
        }

        return sizeChart.get(category)* distance;
    }
    
}
