package interfacesimpl.run;

public interface Chain {
    void lock();
    void wear();
    void shine();
    default void dog(){
        System.out.println("dog");
    }
}
