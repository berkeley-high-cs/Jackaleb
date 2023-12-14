import java.util.ArrayList;

class Interval{

    public double[] intervalReducer(ArrayList<Double> rolls){
        double startInterval = rolls.get((int) (0.05 * rolls.size()));
        double endInterval = rolls.get((int)(0.95 * rolls.size()));
        double[] result = {startInterval, endInterval};

        return result;
    }

}