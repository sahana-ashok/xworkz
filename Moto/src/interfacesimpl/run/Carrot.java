package interfacesimpl.run;

public interface Carrot {
    void isHealthy();
    void usedInSalad();
    void hasVitaminA();

    default void vegie(){
        System.out.println("vagie");
    }
}
