package interfacesimpl.run;

public interface Gold {
    void shine();
    void isExpensive();
    void usedForJewellery();
    default void rate(){
        System.out.println("rate");
    }
}
