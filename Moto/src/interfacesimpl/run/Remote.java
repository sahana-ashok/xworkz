package interfacesimpl.run;

public interface Remote {
    void pressButton();
    void connectDevice();
    void changeSetting();
    default void press(){
        System.out.println("press");
    }
}
