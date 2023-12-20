import java.util.*;

public class Simulation {

  public static Interval measure(RandomVariable r, int iters) {
   ArrayList<Double> list = new ArrayList();
   ArrayList<Double> refinedList = new ArrayList();
   double high = 0;
   double low = 0;
    for(int i = 0; i< iters; i++){

        list.add(r.next());
      }
    Collections.sort(list);
    low = list.get((int)(list.size() * 0.05));
    high = list.get((int)(list.size() * 0.95));

    return new Interval(low , high);
    }
    

    public static void main(String[] args) {
       RandomVariable testeR;
       Normal norm = new Normal();
       Normal norm2 = new Normal();
       Simulation sim = new Simulation();
       Random randumb = new Random();
       LogNormal logNorm = new LogNormal();
       Interval output = new Interval(0, 0);
     
     // testeR.NormalSDM();
     norm.NormalSDM(-1.645, 1.645); 
     output = sim.measure(testeR, 100);
     randumb.nextGaussian(-1.645, 1.645);
     logNorm.LogNormal(0.1, 1.645);
     
     System.out.println();
     System.out.println(norm.next());
     System.out.println(logNorm.next());

     System.out.println(output.low() + " " + output.high());

     System.out.println(testeR.next());
      


    }
    
}