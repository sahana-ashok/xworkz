package interfacesimpl.run;

public interface Trolley {
    void roll();
    void carry();
    void store();
    default void hold(){
        System.out.println("hold");
    }
}
