package interfacesimpl.run;

public interface Petrol {
    void fill();
    void burn();
    void checkLevel();
    default void money(){
        System.out.println("money");
    }
}
