package interfacesimpl.run;

public class PondsImpli implements Ponds {
    @Override
    public void smoothSkin() {
        System.out.println("Skin is smooth");
    }

    @Override
    public void glow() {
        System.out.println("Glowing effect applied");
    }

    @Override
    public void freshFeel() {
        System.out.println("Feeling fresh");
    }

    @Override
    public void cream() {
        System.out.println("ponds is a cream");
    }
}
