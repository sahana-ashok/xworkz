package interfacesimpl.run;

public class SaturnImpli implements Saturn {
    @Override
    public void rotate() {
        System.out.println("Saturn is rotating");
    }

    @Override
    public void hasRings() {
        System.out.println("Saturn has beautiful rings");
    }

    @Override
    public void attractMoons() {
        System.out.println("Saturn has many moons");
    }

    @Override
    public void planet() {
        System.out.println("planet");
    }
}
