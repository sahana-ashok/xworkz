package interfacesimpl.run;

public interface Watch {
    void showTime();
    void setAlarm();
    void waterproof();
    default void time(){
        System.out.println("time");
    }
}
