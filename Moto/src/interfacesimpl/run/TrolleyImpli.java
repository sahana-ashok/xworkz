package interfacesimpl.run;

public class TrolleyImpli implements Trolley {
    @Override
    public void roll() {
        System.out.println("Trolley is rolling");
    }

    @Override
    public void carry() {
        System.out.println("Trolley is carrying luggage");
    }

    @Override
    public void store() {
        System.out.println("Trolley is used to store items");
    }

    @Override
    public void hold() {
        System.out.println("hold");
    }
}
