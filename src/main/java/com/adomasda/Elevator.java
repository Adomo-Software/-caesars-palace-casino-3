package com.adomasda;

import com.adomasda.Floors.AvailableFloor;
import com.adomasda.Floors.Floor;
import com.adomasda.Floors.UnavailableFloor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Elevator {
    public List<String> allFloors = new ArrayList<>();
    public HashMap<String, Floor> unavailableFloors = new HashMap<>();

    public void allFloors(Floor allFloors) {
        this.allFloors.add(allFloors.enter());
    }
    public void addUnavailableFloor(UnavailableFloor availableFloor) {
        this.unavailableFloors.put(availableFloor.enter(), availableFloor);
    }
    public void goToFloor(int floorNumber) {
        for (int i = 0;
             !unavailableFloors.containsKey(Integer.toString(floorNumber)) &&
                     i < floorNumber;
             i++) {
            String floor = allFloors.get(i);
            System.out.println(floor);
        }
    }
}