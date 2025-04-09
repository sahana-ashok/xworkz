package com.xworkz.prog.tostrings.src.com.xworkz.objecttostring.internals;

public class Band {

        private String name;
        private String genre;
        private int members;

        public Band(String name, String genre, int members) {
            this.name = name;
            this.genre = genre;
            this.members = members;
        }

        @Override
        public String toString() {
            return "Band [Name = " + name + ", Genre = " + genre + ", Members = " + members + "]";
        }
    }


