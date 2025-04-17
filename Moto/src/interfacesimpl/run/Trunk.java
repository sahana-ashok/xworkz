package interfacesimpl.run;

public interface Trunk {
    void open();
    void putItems();
    void close();
    default void elephant(){
        System.out.println("ele");
    }
}
