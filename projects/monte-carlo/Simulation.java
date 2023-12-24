import java.util.*;

public class Simulation {

  public static Interval measure(RandomVariable r, int iters) {
   ArrayList<Double> list = new ArrayList();
    for(int i = 0; i< iters; i++){
        list.add(r.next());
      }
    Collections.sort(list);
    double low = list.get((int)(list.size() * 0.05));
    double high = list.get((int)(list.size() * 0.95));

    return new Interval(low , high);
    }
    

    public static void main(String[] args) {
       //RandomVariable testeR;
       Normal norm = new Normal(-1.645, 1.645);
       Normal norm2 = new Normal(10, 20);
       Simulation sim = new Simulation();
       LogNormal logNorm = new LogNormal(10, 20);
       Sum s1 = new Sum(norm,logNorm);
     
     // testeR.NormalSDM();
      System.out.println("norm: " + sim.measure(norm, 10000));
      System.out.println("norm: " + sim.measure(norm2, 10000));
      System.out.println("logNorm: " + sim.measure(logNorm, 10000));
      System.out.println("Addative: " + sim.measure(s1, 10000));


    }
    
}