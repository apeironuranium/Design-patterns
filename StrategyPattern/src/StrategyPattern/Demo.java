package StrategyPattern;

/**
 * Created by leral on 21.06.2017.
 */
public class Demo {
    public static void main(String[] args){
        Check check = new Check(new GettingOlder());
        check.print();
        check.setStrategy(new TooOld());
        check.print();
    }
}
