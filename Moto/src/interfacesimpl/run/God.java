package interfacesimpl.run;

public interface God {
    void bless();
    void forgive();
    void guide();
    default void havePlan(){
        System.out.println("have plan");
    }
}
