import java.util.HashMap;
import java.util.Map;

public class SofaCalc implements ShipmentCalc{
    private static Map<String, Double> sizeChart = new HashMap<>();
    static {//the value parameter (double) represents 
            //cost per kilometer of distance to travel
        sizeChart.put("small", 120.0);
        sizeChart.put("medium", 200.0);
        sizeChart.put("large", 300.0);
    }

    @Override
    public double compute(double size, double distance) {
        String category = "";
        double extra = 0.0;

        if(size <=57.0){
            category = "small";
            extra = 10.0;
        }
        else if(size > 58.0 && size < 72.0){
            category = "medium";
            extra = 20.0;
        }
        else{
            category = "large";
            extra = 40.0;
        }

        return sizeChart.get(category)*distance + extra;
    }
    
}
