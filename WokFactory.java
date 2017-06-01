package Factory;

/**
 * Created by leral on 23.05.2017.
 */
public class WokFactory {
    public static Wok createWok(String type) {
        Wok wok = null;
        if (type.equals("Shanhai")) {
            wok = new ShanhaiWok();
        } else if (type.equals("CusCus")) {
            wok = new CusCusWok();
        } else if (type.equals("ErevanKebab")) {
            wok = new ErevanKebabWok();
        }
        return wok;
    }

    public static void main(String[] args){
        Wok myWok = WokFactory.createWok("Shanhai");
        System.out.println(">>>" + myWok + " of " + myWok.getClass());
        System.out.println(">>>" + WokFactory.createWok("CusCus"));
        System.out.println(">>>" + WokFactory.createWok("ErevanKebab"));
    }
}


