import java.util.*;

public class LogNormal implements RandomVariable {

    private RandomVariable normalRV;
    


    public LogNormal(double low, double high){
        
        double logLow = Math.log(low);
        double logHigh = Math.log(high);
        normalRV = new Normal(logLow, logHigh);
    }

    public double next(){
    //return low + high;
     // return r.nextGaussian(mean, standardDev);
        return Math.exp(normalRV.next());
       //return Math.exp();
    }

        
    // next: return Math.exp(normalRV.next())
}