package interfacesimpl.run;

public class RoseImpli implements Rose {
    @Override
    public void smell() {
        System.out.println("Rose has a sweet smell");
    }

    @Override
    public void bloom() {
        System.out.println("Rose blooms beautifully");
    }

    @Override
    public void hasThorns() {
        System.out.println("Rose has thorns");
    }

    @Override
    public void flower() {
        System.out.println("rose is floew");
    }
}
