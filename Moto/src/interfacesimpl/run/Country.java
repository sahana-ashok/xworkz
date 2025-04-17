package interfacesimpl.run;

public interface Country {
    void develop();
    void maintainLaw();
    void representCulture();
    default void india(){
        System.out.println("india");
    }
}
