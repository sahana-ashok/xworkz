package interfacesimpl.run;

public interface Leave {
    void apply();
    void approve();
    void reject();
    default void take(){
        System.out.println("take");
    }
}
