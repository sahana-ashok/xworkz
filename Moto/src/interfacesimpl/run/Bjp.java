package interfacesimpl.run;

public interface Bjp {
    void winElection();
    void makeSpeech();
    void launchScheme();
    default void party(){
        System.out.println("party");
    }
}
