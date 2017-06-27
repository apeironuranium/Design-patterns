package StrategyPattern;

/**
 * Created by leral on 21.06.2017.
 */
public class GettingOlder implements BehaviorStrategy {
       @Override
       public void print() {
           String i = ("For today I've had enough hamburgers");
           System.out.println(i);
        }
}
