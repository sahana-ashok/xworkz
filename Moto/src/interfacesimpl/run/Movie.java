package interfacesimpl.run;

public interface Movie {
    void play();
    void pause();
    void stop();
    default void watch(){
        System.out.println("watch");
    }
}
