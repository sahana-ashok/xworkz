package com.xworkz.prog.tostring.innerfiles;

public class Document {
    private int weight;
    private String capacity;
    private double size;

    public Document(int weight, String capacity, double size) {
        this.weight = weight;
        this.capacity = capacity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Document [weight=" + weight + ", capacity=" + capacity + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 7797;
    }
}
