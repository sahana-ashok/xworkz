package interfacesimpl.run;

public class HMImpli implements HM {
    @Override
    public void design() {
        System.out.println("Designing clothes");
    }

    @Override
    public void trend() {
        System.out.println("Setting new fashion trend");
    }

    @Override
    public void sell() {
        System.out.println("Selling stylish clothes");
    }

    @Override
    public void brand() {
        System.out.println("cloth brand");
    }
}
