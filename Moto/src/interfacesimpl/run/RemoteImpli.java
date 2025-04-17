package interfacesimpl.run;

public class RemoteImpli implements Remote {
    @Override
    public void pressButton() {
        System.out.println("Button pressed on remote");
    }

    @Override
    public void connectDevice() {
        System.out.println("Remote connected to device");
    }

    @Override
    public void changeSetting() {
        System.out.println("Changing setting with remote");
    }

    @Override
    public void press() {
        System.out.println("press remote");
    }
}
