import java.util.HashMap;
import java.util.Map;

public class ChairCalc implements ShipmentCalc{
    private static Map<String, Double> sizeChart = new HashMap<>();
    static {
        sizeChart.put("small", 30.0);
        sizeChart.put("medium", 40.0);
        sizeChart.put("large", 50.0);
    }

    @Override
    public double compute(double size, double distance) {
        String category = "";

        if(size <=18.0){
            category = "small";
        }
        else if(size > 18.0 && size < 24.0){
            category = "medium";
        }
        else{
            category = "large";
        }

        return sizeChart.get(category);
    }
    
}
