package com.xworkz.prog.casting;

public class Color {
    public void select(Rug rug) {
        rug.cover();
        rug.fold();
        rug.design();
        rug.wash();
        rug.texture();

        if(rug instanceof CottonRug){
            System.out.println("rug instanceof CottonRug");
            CottonRug cottonRug = (CottonRug) rug;
            cottonRug.size();
        }
    }
}
