package interfacesimpl.run;

public interface AC {
    void coolRoom();
    void setTemperature();
    void swing();

    default void costly(){
        System.out.println("AC is costly");
    }
}
