package com.adomasda.Floors;

import com.adomasda.FloorConfig;

public class AvailableFloor extends Floor {
    public AvailableFloor(FloorConfig floorConfig, String textOnEnter) {
        super(floorConfig, textOnEnter);
        elevator.allFloors(this);
    }
}
