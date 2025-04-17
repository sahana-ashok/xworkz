package interfacesimpl.run;

public interface Sunflower {
    void faceSun();
    void produceSeeds();
    void growTall();
    default void flower(){
        System.out.println("flower");
    }
}
