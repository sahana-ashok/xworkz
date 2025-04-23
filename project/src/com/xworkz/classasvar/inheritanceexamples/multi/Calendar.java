package com.xworkz.prog.inheritanceexamples.multi;

import java.util.Calendar;

public class wallCalendar {
    void showDate()
    {
        System.out.println("Calendar shows date");
    }
}

class WallCalendar extends Calendar {
    void hangOnWall()
    {
        System.out.println("WallCalendar   hung on wall");
    }
}

class OnlineCalendar extends WallCalendar {
    void syncEvents()
    {
        System.out.println("OnlineCalendar syncs events with cloud");
    }
}