package interfacesimpl.run;

public interface Dead {
    void remember();
    void bury();
    void mourn();
    default void body(){
        System.out.println("body");
    }
}
