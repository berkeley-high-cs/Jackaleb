public class Simulation {

    /*public static Interval measure(RandomVariable r, int iters) {

    }
*/
    public static void main(String[] args) {
       Normal e = new Normal();
        
     e.NormalSDM(-1.645, 1.645);

     System.out.println(e.next());
    }
}