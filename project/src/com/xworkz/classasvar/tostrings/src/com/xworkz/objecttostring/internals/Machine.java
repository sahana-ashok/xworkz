package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Machine {

        private String name;
        private boolean isAutomatic;

        public Machine(String name, boolean isAutomatic) {
            this.name = name;
            this.isAutomatic = isAutomatic;
        }

        @Override
        public String toString() {
            return "Machine [Name = " + name + ", Automatic = " + isAutomatic + "]";
        }
    }

