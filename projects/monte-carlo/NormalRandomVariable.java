import java.util.*;
import java. lang. Math;
import static java.util.Collections.sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class NormalRandomVariable implements RandomVariable{

    private static Random r = new Random();
    ArrayList<Double> randomNum(int population){

    }
        private static ArrayList<Double> normalValues(int population){
        for(int i = 0; i < population; i++){
            double randomNum = mean + stddev * r.nextGaussian();
            additionalValues.add(randomNum);
        }

        Collections.sort(additionalValues);
        return additionalValues;
        }
    }
