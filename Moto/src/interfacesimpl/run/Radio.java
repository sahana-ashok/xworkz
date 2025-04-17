package interfacesimpl.run;

public interface Radio {
    void tune();
    void playMusic();
    void increaseVolume();
    default void play(){
        System.out.println("play");
    }
}
