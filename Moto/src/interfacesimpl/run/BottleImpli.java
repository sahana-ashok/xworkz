package interfacesimpl.run;

public class BottleImpli implements Bottle {
    @Override
    public void fill() {
        System.out.println("Bottle is filled");
    }

    @Override
    public void pour() {
        System.out.println("Bottle pouring water");
    }

    @Override
    public void isReusable() {
        System.out.println("Bottle is reusable");
    }

    @Override
    public void water() {
        System.out.println("bottle to fill water");
    }
}
