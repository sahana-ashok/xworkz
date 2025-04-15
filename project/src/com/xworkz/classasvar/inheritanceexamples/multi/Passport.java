package com.xworkz.prog.inheritanceexamples.multi;

public class Passport {
    void identifyHolder() {
        System.out.println("Passport identifies holder");
    }
}

class OfficialPassport extends Passport {
    void accessRestrictedAreas() {
        System.out.println("OfficialPassport gives access to restricted zones");
    }
}

class DiplomaticPassport extends OfficialPassport {
    void grantImmunity() {
        System.out.println("DiplomaticPassport grants diplomatic immunity");
    }

}
