package interfacesimpl.run;

public interface Barbie {
    void dressUp();
    void talk();
    void play();

    default void fav(){
        System.out.println("fav");
    }
}
