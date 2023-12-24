import java.util.*;

public class Sum implements RandomVariable{
    private RandomVariable input1;
    private RandomVariable input2;

    public Sum(RandomVariable input1, RandomVariable input2){
        this.input1 = input1;
        this.input2 = input2;
    }

    public double next(){
        return input1.next() + input2.next();
    }
}