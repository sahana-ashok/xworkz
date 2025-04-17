package interfacesimpl.run;

public interface Fridge {
    void coolItems();
    void storeFood();
    void makeIce();
    default void things(){
        System.out.println("things");
    }
}
