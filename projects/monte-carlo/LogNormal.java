public class LogNormal implements RandomVariable {

    private RandomVariable normalRV;
    private Random r = new Random();
    private double logHigh;
    private double logLow;
    private double mean;
    private double standardDev;

    LogNormal(double low, double high){
        logLow = Math.log(low);
        logHigh = Math.log(high);
        mean = (low + high) / 2;
        standardDev = (mean - low) / 1.645;
        // initialize normalRV
    }

    public double next(){
    return r.nextGaussian(mean, standardDev);
    }

        
    // next: return Math.exp(normalRV.next())
}