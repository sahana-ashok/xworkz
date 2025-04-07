package com.xworkz.prog.Output;

import com.xworkz.prog.casting.AIChatgpt;
import com.xworkz.prog.casting.Chatgpt;
import com.xworkz.prog.casting.Develop;

public class ChatgptRunner {
    public static void main(String[] args) {

        Chatgpt chatgpt1 = new Chatgpt();
        chatgpt1.reply();
        chatgpt1.learn();
        chatgpt1.help();
        chatgpt1.integrate();
        chatgpt1.support();

        System.out.println("-------------------");

        Chatgpt chatgpt = new AIChatgpt();
        chatgpt.reply();
        chatgpt.learn();
        chatgpt.help();
        chatgpt.integrate();
        chatgpt.support();

        System.out.println("-----------------");

        AIChatgpt aiChatgpt = new AIChatgpt();
        aiChatgpt.reply();
        aiChatgpt.learn();
        aiChatgpt.help();
        aiChatgpt.integrate();
        aiChatgpt.support();

        System.out.println("---------- Develop Class Calling ----------");

        Develop develop = new Develop();
        develop.checkPerformance(chatgpt);
        develop.checkPerformance(chatgpt1);
        develop.checkPerformance(aiChatgpt);
    }
}
}
