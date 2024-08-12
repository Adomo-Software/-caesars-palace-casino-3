package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class UnavailableFloor extends Floor {
    UnavailableFloor(FloorConfig floorConfig, String textOnEnter) {
        super(floorConfig, textOnEnter);
        elevator.addUnavailableFloor(this);
        this.textOnEnter = textOnEnter + " - under construction";
        elevator.allFloors(this);
    }
}