package interfacesimpl.run;

public interface Train {
    void run();
    void stop();
    void horn();
    default void big(){
        System.out.println("big");
    }
}
