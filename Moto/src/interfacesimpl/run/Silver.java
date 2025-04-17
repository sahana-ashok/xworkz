package interfacesimpl.run;

public interface Silver {
    void usedInUtensils();
    void polish();
    void reflectLight();
    default void metal(){
        System.out.println("metal");
    }
}
