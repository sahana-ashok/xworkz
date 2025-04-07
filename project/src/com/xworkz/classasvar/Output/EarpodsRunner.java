package com.xworkz.prog.Output;

import com.xworkz.prog.casting.earpods.Case;
import com.xworkz.prog.casting.earpods.Earpods;
import com.xworkz.prog.casting.earpods.WirelessEarpods;
public class EarpodsRunner {
    public static void main(String[] args) {

        Earpods earpods = new Earpods();
        earpods.play();
        earpods.charge();
        earpods.connect();
        earpods.noiseCancel();
        earpods.touchControl();

        System.out.println("-----------------");

        Earpods wireless = new WirelessEarpods();
        wireless.play();
        wireless.charge();
        wireless.connect();
        wireless.noiseCancel();
        wireless.touchControl();

        System.out.println("-----------------");

        WirelessEarpods wirelessEarpods = new WirelessEarpods();
        wirelessEarpods.play();
        wirelessEarpods.charge();
        wirelessEarpods.connect();
        wirelessEarpods.noiseCancel();
        wirelessEarpods.touchControl();

        System.out.println("-----------------");

        Case caseObj = new Case();
        caseObj.carry(wirelessEarpods);
        caseObj.carry(wireless);
        caseObj.carry(earpods);
    }
}
