package interfacesimpl.run;

public interface Network {
    void connect();
    void transferData();
    void disconnect();
    default void speed(){
        System.out.println("speed");
    }
}
