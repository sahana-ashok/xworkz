package interfacesimpl.run;

public interface Teachers {
    void teach();
    void evaluate();
    void guideStudents();
    default void strict(){
        System.out.println("strict");
    }
}
