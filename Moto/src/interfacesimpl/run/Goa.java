package interfacesimpl.run;

public interface Goa {
    void enjoyBeach();
    void party();
    void exploreChurches();
    default void place(){
        System.out.println("place");
    }
}
