package interfacesimpl.run;

public class WaterImpli implements Water {
    @Override
    public void drink() {
        System.out.println("Drinking water");
    }

    @Override
    public void boil() {
        System.out.println("Boiling water");
    }

    @Override
    public void flow() {
        System.out.println("Water is flowing");
    }

    @Override
    public void cost() {
        System.out.println("water");
    }
}
