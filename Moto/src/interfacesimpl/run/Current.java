package interfacesimpl.run;

public interface Current {
    void flow();
    void shock();
    void lightUp();
    default void volt(){
        System.out.println("volt");
    }
}
