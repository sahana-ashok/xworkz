package interfacesimpl.run;

public interface Doctor {
    void diagnose();
    void prescribe();
    void performSurgery();
    default void human(){
        System.out.println("human");
    }
}
