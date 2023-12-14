import java.util.*;
import java. lang. Math;

import static java.util.Collections.sort;

public class Gambling {
    private int population;
    private static Random r = new Random();
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

    

    public static void main(String [] args){
        
        int population = 1000000;
        
        ArrayList<Double> rolls = normalValues(population);
        Interval intervalles = new Interval();
        double[] predictionInterval = intervalles.intervalReducer(rolls);
        double predictedMean = Mean.mean(predictionInterval);
        double predictedVariance = StandardDev.estimatedVarience(predictionInterval);
        double predictedStandD = Math.sqrt(predictedVariance);
        double[] predictedNormalVals = NormalDistribution.normalValues(predictedMean, predictedStandD);
        double[] step2Norm = step2NormalDistribution.step2Normal(predictedMean, predictedStandD);
        double[] predictedLog = Log.calculateLog(predictedNormalVals);
        System.out.println("Mean: " + predictedMean);
        System.out.println("Low: " + predictedNormalVals[0]);
        System.out.println("High: " + predictedNormalVals[1]);
        System.out.println("STEP2: Low " + predictedNormalVals[1]);
        System.out.println("STEP2: High " + predictedNormalVals[1]);
    }
    
}
    
