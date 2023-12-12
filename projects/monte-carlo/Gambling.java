import java.util.*;
import java. lang. Math;
import java.util.ArrayList;
import static java.util.Collections.sort;

public class Gambling {
    private int population;
    private static Random random = new Random();
    private ArrayList<Double> GStorage = new ArrayList<Double>();

    public static ArrayList<Double> gaussianStorage(int population){
       ArrayList<Double> csgoCases = new ArrayList<Double>();
        for(int i = 0; i < population; i++){
            double randomKnife = random.nextGaussian();
            csgoCases.add(randomKnife);
        }
        Collections.sort(csgoCases);
        return csgoCases;
        
//population = initPopulation;
    }

    

    public static void main(String[] args) {
        Gambling g = new Gambling();
        System.out.println("help me please: " + g.random.nextInt());
    }

class Interval{

    public double[] intervalReducer(ArrayList<Double> rolls){
        double startInterval = rolls.get((int) (0.05 * rolls.size()));
        double endInterval = rolls.get((int)(0.95 * rolls.size()));
        double[] result = {startInterval, endInterval};

        return result;
    }

}
class Mean{
    public double mean(double[] interval) {
        double highest = interval[1];
        double lowest = interval[0];
        return (highest + lowest) / 2.0;
    }
}

class StandardDev{
    public double estimatedVarience(double[] interval){
        // low = mean - stddev * 1.645
        double low = interval[0];
        double high = interval[1];
        double mean = (high + low) / 2.0;
        // stddev * 1.645 = mean - low
        // stddev = (mean - low) / 1.645
        return (mean - low) / 1.645;
    }
}

class NormalDistribution{
    public double[] normalValues( double mean, double predictedStandD){
        double low = mean - predictedStandD * 1.645;
        double high = mean + predictedStandD * 1.645;
        double[] normalVals = {low, high};
        return normalVals;
    }
}

class Log {
    public double[] calculateLog(double[] normalValues) {
        double logOfMin = Math.log(normalValues[0]);
        double logOfMax = Math.log(normalValues[1]);
        double[] logValues = {logOfMin, logOfMax};
        return logValues;
    }
    }  


    class NormalRandomVariable implements RandomVariable{
        private Random r = new Random();
        ArrayList<Double> normalValues(int population){
    
        }
        public RandomVariable(){
            this.random = random;
        }
    }

}
