package interfacesimpl.run;

public interface University {
    void conductExam();
    void publishResults();
    void grantDegrees();
    default void place(){
        System.out.println("place");
    }
}
