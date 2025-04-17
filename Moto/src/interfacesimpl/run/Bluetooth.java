package interfacesimpl.run;

public interface Bluetooth {
    void pairDevice();
    void sendFile();
    void unpair();
    default void connect(){
        System.out.println("connect");
    }
}
