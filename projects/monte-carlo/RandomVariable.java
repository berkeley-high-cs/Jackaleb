import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;

interface RandomVariable{
    double next();
}

class NormalRandomVariable implements RandomVariable {

    private Random r = new Random();
    double [] data = {};
    private double mean = Mean.mean(data);
    private double stdDev = StandardDev.estimatedVarience(data);
    private ArrayList<Double> additionalValues;

    private ArrayList<Double> normalValues(int population){
        for (int i = 0; i < population; i++) {
            double randomNum = mean + stdDev r.nextGaussian();
            additionalValues.add(randomNum);
        }

        Collections.sort(additionalValues);
        return additionalValues;
    }

    @Override
    public double next() {
        // Provide a meaningful implementation for the next() method
        return mean + stdDev * r.nextGaussian();
    }
    

}
