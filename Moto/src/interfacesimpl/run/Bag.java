package interfacesimpl.run;

public interface Bag {
    void closeJip();
    void keepSafe();
    void size();

    default void need(){
        System.out.println("need");
    }
}
