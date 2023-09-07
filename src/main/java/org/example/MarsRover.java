package org.example;

import java.util.ArrayList;
import java.util.List;

public class MarsRover extends Vehicle implements Output, Move, Validate, Parse {

    @Override
    public Character left(Character direction) {
        Character newDirection = switch (direction) {
            case 'N' -> 'W';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'E' -> 'N';
            default -> 'X';
        };

        return newDirection;
    }

    @Override
    public Character right(Character direction) {
        Character newDirection = switch (direction) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default -> 'X';
        };

        return newDirection;
    }
    @Override
    public void moveVehicle(int[] xArray, int[] yArray, Character direction)
    {
        switch (direction) {
            case 'E' -> xArray[0]++;
            case 'W'-> xArray[0]--;
            case 'N' -> yArray[0]++;
            case 'S'-> yArray[0]--;
            default -> {
            }
        }
    }

    @Override
    public String outputFinalCoordinates(int positionX, int positionY, Character direction) {
        return positionX + " " + positionY + " " + direction;
    }

    @Override
    public boolean validateInitialPosition(int positionX, int positionY) {

        // To prove this function works, place a vehicle at a location
        List<InitialPosition> existingLocations = new ArrayList<>();
        InitialPosition ip = new InitialPosition();
        ip.positionX = 4;
        ip.positionY = 4;
        existingLocations.add(ip);

        //return list.stream().filter(o -> o.getName().equals(name)).findFirst().isPresent();

        for(InitialPosition zz : existingLocations) {
            if ((zz.positionX == positionX) && (zz.positionY == positionY)){
                System.out.println("Vehicle is already located at this position");
                return true;
            }
        }
        //System.out.println("An existing vehicle is NOT located at this position");
        return false;
    }

    @Override
    public boolean parseVehicleMovements(String vehicleMovements) {
        int count = vehicleMovements.length();

        for (int i = 0; i < count; i++) {
            Character ch = vehicleMovements.charAt(i);

            switch (ch) {
                case 'L':
                    break;
                case 'M':
                    break;
                case 'R':
                    break;
                default:
                    System.out.println("An invalid character has been entered");
                    return false;
            };

        }
        //System.out.println("All proposed vehicle movements are valid");
        return true;
    }

}
