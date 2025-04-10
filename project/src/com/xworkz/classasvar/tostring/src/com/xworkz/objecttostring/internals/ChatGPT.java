package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class ChatGPT {
    private String version;
    private String creator;
    private boolean isAI;

    public ChatGPT(String version, String creator, boolean isAI) {
        this.version = version;
        this.creator = creator;
        this.isAI = isAI;
    }

    @Override
    public String toString() {
        return "ChatGPT details: Version = " + version + ", Creator = " + creator + ", Is AI = " + isAI;
    }

}
