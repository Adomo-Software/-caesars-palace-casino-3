package com.adomasda;

import com.adomasda.Floors.*;

import java.util.HashMap;

public class Main {
    enum GameType {
        POKER,
        PACHINKO_MACHINE,
        SLOT_MACHINE,
        BLACKJACK
    }

    enum ServiceType {
        SPA,
        SHOP
    }


    public static void main(String[] args) {
        FloorConfig firstFloorConfig = new FloorConfig(
                GameType.BLACKJACK, GameType.SLOT_MACHINE, ServiceType.SPA);
        FloorConfig secondFloorConfig =
                new FloorConfig(GameType.PACHINKO_MACHINE,
                        GameType.PACHINKO_MACHINE, ServiceType.SHOP);

        Elevator elevator = new Elevator();

        Floor.setElevator(elevator);
        AvailableFloor firstFloor = new FirstFloor(firstFloorConfig);
        AvailableFloor secondFloor = new SecondFloor(new FloorConfig(GameType.PACHINKO_MACHINE));
        UnavailableFloor thirdFloor = new ThirdFloor(secondFloorConfig);
        AvailableFloor fourthFloor = new FourthFloor(secondFloorConfig);

        elevator.goToFloor(4);

    }
}
