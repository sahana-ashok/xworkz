package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Device {

        private String name;
        private String brand;
        private boolean isSmart;

        public Device(String name, String brand, boolean isSmart) {
            this.name = name;
            this.brand = brand;
            this.isSmart = isSmart;
        }

        @Override
        public String toString() {
            return "Device [Name = " + name + ", Brand = " + brand + ", Smart = " + isSmart + "]";
        }

}
