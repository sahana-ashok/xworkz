package interfacesimpl.run;

public class FriendImpli implements Friend {
    @Override
    public void support() {
        System.out.println("Friend supports in tough times");
    }

    @Override
    public void share() {
        System.out.println("Friend shares everything");
    }

    @Override
    public void makeLaugh() {
        System.out.println("Friend makes you laugh");
    }

    @Override
    public void inNeed() {
        System.out.println("friend in need");
    }
}
