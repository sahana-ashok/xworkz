package interfacesimpl.run;

public interface Moon {
    void glow();
    void reflectSunlight();
    void appearAtNight();
    default void light(){
        System.out.println("light");
    }
}
