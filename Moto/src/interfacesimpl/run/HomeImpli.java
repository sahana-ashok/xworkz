package interfacesimpl.run;

public class HomeImpli implements Home{
    @Override
    public void slipperOutSide() {
        System.out.println("slipperOutSide");
    }

    @Override
    public void sleepEarly() {
        System.out.println("sleepEarly");

    }

    @Override
    public boolean speakLoud() {
        System.out.println("speakLoud");
        return false;
    }

    @Override
    public void place() {
        System.out.println("home is safe place");
    }
}
