package interfacesimpl.run;

public class SilverImpli implements Silver {
    @Override
    public void usedInUtensils() {
        System.out.println("Silver is used in utensils");
    }

    @Override
    public void polish() {
        System.out.println("Silver needs polishing");
    }

    @Override
    public void reflectLight() {
        System.out.println("Silver reflects light");
    }

    @Override
    public void metal() {
        System.out.println("metal silver");
    }
}
