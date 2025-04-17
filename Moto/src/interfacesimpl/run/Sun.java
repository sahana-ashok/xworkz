package interfacesimpl.run;

public interface Sun {
    void rise();
    void set();
    void giveLight();
    default void bright(){
        System.out.println("bright");
    }
}
