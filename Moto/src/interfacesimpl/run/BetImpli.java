package interfacesimpl.run;

public class BetImpli implements Bet {
    @Override
    public void place() {
        System.out.println("Placing a bet");
    }

    @Override
    public void win() {
        System.out.println("Won the bet");
    }

    @Override
    public void lose() {
        System.out.println("Lost the bet");
    }

    @Override
    public void notGood() {
        System.out.println("betting is not good");
    }
}
