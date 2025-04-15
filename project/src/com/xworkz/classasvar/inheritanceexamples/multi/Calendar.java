package com.xworkz.prog.inheritanceexamples.multi;

public class Calendar {
    void showDate() {
        System.out.println("Calendar shows date");
    }
}

class WallCalendar extends Calendar {
    void hangOnWall() {
        System.out.println("WallCalendar can be hung on wall");
    }
}

class OnlineCalendar extends WallCalendar {
    void syncEvents() {
        System.out.println("OnlineCalendar syncs events with cloud");
    }
}
