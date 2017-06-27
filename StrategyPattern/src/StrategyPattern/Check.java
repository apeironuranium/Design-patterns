package StrategyPattern;

/**
 * Created by leral on 21.06.2017.
 */
public class Check {
    private BehaviorStrategy strategy;

    public Check(BehaviorStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(BehaviorStrategy strategy){
        this.strategy = strategy;
    }

    public void print(){
        this.strategy.print();
    };
 //   public Check(){
  //      return strategy();
 //   }
}
