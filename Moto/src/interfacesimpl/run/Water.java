package interfacesimpl.run;

public interface Water {
    void drink();
    void boil();
    void flow();
    default void cost(){
        System.out.println("cost");
    }
}
