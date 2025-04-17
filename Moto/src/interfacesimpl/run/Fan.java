package interfacesimpl.run;

public interface Fan {
    void rotate();
    void coolAir();
    void changeSpeed();
    default void must(){
        System.out.println("must");
    }
}
