package interfacesimpl.run;

public interface Shoe {
    void wear();
    void polish();
    void walk();
    default void size(){
        System.out.println("size");
    }
}
