package com.xworkz.prog.casting;

public class Develop {
    public void checkPerformance(Chatgpt chatgpt) {
        chatgpt.reply();
        chatgpt.learn();
        chatgpt.help();
        chatgpt.integrate();
        chatgpt.support();

        if (chatgpt instanceof AIChatgpt) {
            System.out.println("chatgpt instanceof AIChatgpt");
            AIChatgpt aiChatgpt = (AIChatgpt) chatgpt;
            aiChatgpt.autoSuggest();
        }
    }
}
