package interfacesimpl.run;

public interface Chair {
    void sitOn();
    void hasLegs();
    void isComfortable();
    default void plastic(){
        System.out.println("plastic");
    }
}
