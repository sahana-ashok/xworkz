package interfacesimpl.run;

public class TempleImpli implements Temple {
    @Override
    public void openGate() {
        System.out.println("Temple gate is opened");
    }

    @Override
    public void performPuja() {
        System.out.println("Performing puja in temple");
    }

    @Override
    public void ringBell() {
        System.out.println("Temple bell is ringing");
    }

    @Override
    public void divine() {
        System.out.println("temple is a devine place");
    }
}
