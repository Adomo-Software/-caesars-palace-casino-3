package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public abstract class Floor {
    private FloorConfig floorConfig;
    String textOnEnter;
    static Elevator elevator;

    Floor(FloorConfig floorConfig, String textOnEnter) {
        this.floorConfig = floorConfig;
        this.textOnEnter = textOnEnter;
    }

    public static void setElevator(Elevator elevator) {
        Floor.elevator = elevator;
    }

    public String enter() {
        return this.textOnEnter;
    }
}