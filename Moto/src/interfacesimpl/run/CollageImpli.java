package interfacesimpl.run;

public class CollageImpli implements Collage {
    @Override
    public void conductEvents() {
        System.out.println("Collage is conducting events");
    }

    @Override
    public void provideHostel() {
        System.out.println("Collage is providing hostel facilities");
    }

    @Override
    public void manageDepartments() {
        System.out.println("Collage is managing departments");
    }

    @Override
    public void pesitm() {
        System.out.println("collage is pesitm");
    }
}
