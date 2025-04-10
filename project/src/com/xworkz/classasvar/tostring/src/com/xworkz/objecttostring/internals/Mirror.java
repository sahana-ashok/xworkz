package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Mirror {
        private String shape;
        private double height;
        private boolean isFramed;

        public Mirror(String shape, double height, boolean isFramed) {
            this.shape = shape;
            this.height = height;
            this.isFramed = isFramed;
        }

        @Override
        public String toString() {
            return "Mirror [Shape = " + shape + ", Height = " + height + "ft, Framed = " + isFramed + "]";
        }

}
