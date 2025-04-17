package interfacesimpl.run;

public interface Lotion {
    void apply();
    void protectSkin();
    void moisturize();
    default void a(){
        System.out.println("sa");
    }
}
