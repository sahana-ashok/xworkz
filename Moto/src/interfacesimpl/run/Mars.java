package interfacesimpl.run;

public interface Mars {
    void isRedPlanet();
    void hasDustStorms();
    void hasMountains();
    default void planet(){
        System.out.println("planet");
    }
}
