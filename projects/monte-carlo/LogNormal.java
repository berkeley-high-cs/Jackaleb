import java.util.*;
public class LogNormal implements RandomVariable {

    private RandomVariable normalRV;
    private Random r = new Random();
    private double logHigh;
    private double logLow;
    private double mean;
    private double standardDev;
    private double low;
    private double high;

    void LogNormal(double initLow, double initHigh){
        high = initHigh;
        low = initLow;
        logLow = Math.log(initLow);
        logHigh = Math.log(initHigh);
        mean = (logLow + logHigh) / 2;
        standardDev = (mean - logLow) / 1.645;
        // initialize normalRV
    }

    public double next(){
    return r.nextGaussian(mean, standardDev);
    }

        
    // next: return Math.exp(normalRV.next())
}