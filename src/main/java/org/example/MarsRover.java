package org.example;

public class MarsRover implements Output, Move {

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
    public String outputFinalCoordinates(int x, int y, String direction) {
        return x + " " + y + " " + direction.charAt(0);
    }
}
