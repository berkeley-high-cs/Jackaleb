import java.util.Random;

public class Normal implements RandomVariable {

  private Random r = new Random();
  private double mean;
  private double standardDev;
  private double lowVal;
  private double highVal;

  public void NormalLH(double initMean, double initStandardDev){
    lowVal = initMean - (initStandardDev * 1.645);
    highVal = initMean + (initStandardDev * 1.645);
  }

  public void NormalSDM(double low, double high) {
    mean = (low + high) / 2;
    standardDev = (mean - low) / 1.645;
  }

  public double next() {
   // return mean + standardDev;
    return r.nextGaussian(mean, standardDev);
  }
}
