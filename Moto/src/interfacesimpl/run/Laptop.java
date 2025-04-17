package interfacesimpl.run;

public interface Laptop {
    void powerOn();
    void runPrograms();
    void shutDown();
    default void charge(){
        System.out.println("charge");
    }
}
