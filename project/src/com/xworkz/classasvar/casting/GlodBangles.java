package com.xworkz.prog.casting;

public class GlodBangles extends Bangles{
    public GoldBangles() {
        super();
        System.out.println("Running non-arg constructor GoldBangles");
    }
    @Override
    public void wear() {
        System.out.println("GoldBangles are worn on the wrist--child");
    }
    @Override
    public void material() {
        System.out.println("GoldBangles are made of pure gold--child");
    }
    @Override
    public void tradition() {
        System.out.println("GoldBangles are important in weddings--child");
    }
    @Override
    public void design() {
        System.out.println("GoldBangles have intricate designs--child");
    }
    @Override
    public void symbol() {
        System.out.println("GoldBangles symbolize wealth and tradition--child");
    }

    public void cost(){
        System.out.println("new method cost in child class");
    }

}
