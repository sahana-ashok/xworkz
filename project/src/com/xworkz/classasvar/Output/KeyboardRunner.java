package com.xworkz.prog.Output;

import com.xworkz.prog.casting.keyboard.Keyboard;
import com.xworkz.prog.casting.keyboard.MechanicalKeyboard;
import com.xworkz.prog.casting.keyboard.Plastic;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.type();
        keyboard.connect();
        keyboard.press();
        keyboard.backlight();
        keyboard.wireless();

        System.out.println("-----------");

        Keyboard keyboard2 = new MechanicalKeyboard();
        keyboard2.type();
        keyboard2.connect();
        keyboard2.press();
        keyboard2.backlight();
        keyboard2.wireless();

        System.out.println("-----------");

        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.type();
        mechanicalKeyboard.connect();
        mechanicalKeyboard.press();
        mechanicalKeyboard.backlight();
        mechanicalKeyboard.wireless();

        System.out.println("---------casting");
        Plastic plastic=new Plastic();
        plastic.madeOf(keyboard);
        plastic.madeOf(keyboard2);
        plastic.madeOf(mechanicalKeyboard);
    }
}
