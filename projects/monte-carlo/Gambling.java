import java.util.ArrayList;
import java.util.Random;

public class Gambling {
    private Random random = new Random();
    private ArrayList<Double> GStorage = new ArrayList<Double>();
    public void GaussianStorage(){

    }
    public static void main(String[] args) {
        Gambling g = new Gambling();
        System.out.println("help me please: " + g.random.nextInt());
    }
}
