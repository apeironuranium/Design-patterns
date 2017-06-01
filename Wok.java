package Factory;

/**
 * Created by leral on 23.05.2017.
 */
public abstract class Wok {
    public String model;

    public void prepare() {
        System.out.println("Preparing " + model);
    }

    public void cook() {
        System.out.println("Cooking " + model);
    }

    public void box() {
        System.out.println("Boxing " + model);
    }

    @Override
    public String toString() {
        return "This is " + this.model;
    }
}
