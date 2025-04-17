package interfacesimpl.run;

public interface Money {
    void spend();
    void save();
    void invest();
    default void must(){
        System.out.println("must");
    }
}
