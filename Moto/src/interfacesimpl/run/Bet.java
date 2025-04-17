package interfacesimpl.run;

public interface Bet {
    void place();
    void win();
    void lose();
    default void notGood(){
        System.out.println("not good");
    }
}
