import java.util.Random;

public class Normal implements RandomVariable {

  private Random r = new Random();
  private double mean;
  private double standardDev;

  Normal(double low, double high) {
    mean = (low + high) / 2;
    standardDev = (mean - low) / 1.645;
  }

  public double next() {
    return r.nextGaussian(mean, standardDev);
  }
}
