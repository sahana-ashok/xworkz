package interfacesimpl.run;

public class HotspotImpli implements Hotspot {
    @Override
    public void turnOn() {
        System.out.println("Hotspot is turned on");
    }

    @Override
    public void connectDevice() {
        System.out.println("Device connected to hotspot");
    }

    @Override
    public void turnOff() {
        System.out.println("Hotspot is turned off");
    }

    @Override
    public void connect() {
        System.out.println("connct hotspot");
    }
}
