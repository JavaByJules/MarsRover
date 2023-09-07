package org.example;

import java.util.ArrayList;
import java.util.List;

public class MarsRover extends Vehicle implements Output, Move, Validate, Parse {

    @Override
    public String left(String direction) {
        String newDirection = switch (direction) {
            case "North" -> "West";
            case "West" -> "South";
            case "South" -> "East";
            case "East" -> "North";
            default -> "Incorrect direction sent";
        };

        return newDirection;
    }

    @Override
    public String right(String direction) {
        String newDirection = switch (direction) {
            case "North" -> "East";
            case "East" -> "South";
            case "South" -> "West";
            case "West" -> "North";
            default -> "Incorrect direction sent";
        };

        return newDirection;
    }
    @Override
    public void moveX(int[] xArray, String direction)
    {
        switch (direction) {
            case "East" -> xArray[0]++;
            case "West" -> xArray[0]--;
            default -> {
            }
        }
    }

    @Override
    public void moveY(int[] yArray, String direction)
    {
        switch (direction) {
            case "North" -> yArray[0]++;
            case "South" -> yArray[0]--;
            default -> {
            }
        }
    }

    @Override
    public String outputFinalCoordinates(int positionX, int positionY, String direction) {
        return positionX + " " + positionY + " " + direction.charAt(0);
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
