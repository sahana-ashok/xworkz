package interfacesimpl.run;

public interface Platinum {
    void rareMetal();
    void usedInRings();
    void doesNotTarnish();
    default void metal(){
        System.out.println("metal");
    }
}
