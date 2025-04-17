package interfacesimpl.run;

public interface Bottom {
    void sitOn();
    void balance();
    void support();
    default void up(){
        System.out.println("up");
    }
}
