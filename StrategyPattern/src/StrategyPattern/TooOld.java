package StrategyPattern;

/**
 * Created by leral on 21.06.2017.
 */
public class TooOld implements BehaviorStrategy{
    @Override
    public void print() {
        String i = ("We can't just get enough hamburgers");
        System.out.println(i);
    }
}
