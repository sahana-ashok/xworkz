package com.xworkz.prog.casting;

public class AIChatgpt extends Chatgpt{
    @Override
    public void reply() {
        System.out.println("AIChatgpt is replying with context-aware responses");
    }

    @Override
    public void learn() {
        System.out.println("AIChatgpt is learning from user interactions and data");
    }

    @Override
    public void help() {
        System.out.println("AIChatgpt is helping users intelligently");
    }

    @Override
    public void integrate() {
        System.out.println("AIChatgpt is integrating with third-party systems");
    }

    @Override
    public void support() {
        System.out.println("AIChatgpt is providing multilingual support");
    }

    public void autoSuggest() {
        System.out.println("AIChatgpt is providing auto-suggestions using deep learning");
    }

}
