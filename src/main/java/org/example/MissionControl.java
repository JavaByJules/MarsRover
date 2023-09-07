package org.example;

public class MissionControl {
    private MarsRover r1 = new MarsRover();

    public void createPlateau(int squaresAcross, int squaresDown)
    {
        // The idea is that the identity of each vehicle would be
        // placed in the appropriate part of the array e.g. "S1"
        // Once the vehicle moved from that part of the plateau,
        // the identity of the vehicle would be removed
        String[][] plateauArray;
        plateauArray = new String[squaresAcross][squaresDown];

    }

    public void createRover(int positionX, int positionY, char direction, String vehicleMovements) {

        // Check to see if a vehicle is already located
        // at this position on the plateau
        if (!r1.validateInitialPosition(positionX, positionY)) {
            r1.positionX = positionX;
            r1.positionY = positionY;
            r1.directionFacing = direction;
        }
        // Now to see that the list of vehicle movements contains
        // only valid characters (as explained in the ReadMe doc)
        if (r1.parseVehicleMovements(vehicleMovements)) {
            performVehicleMovements(vehicleMovements);
        }

    }

    public void performVehicleMovements(String vehicleMovements) {
        int count = vehicleMovements.length();

        MarsRover r1 = new MarsRover();

        for (int i = 0; i < count; i++) {
            Character ch = vehicleMovements.charAt(i);

            switch (ch) {
                case 'L':
                    r1.left(ch);
                case 'M':
                    int xArray[] = {r1.positionX};
                    int yArray[] = {r1.positionY};
                    r1.moveVehicle(xArray, yArray, r1.directionFacing);
                    r1.positionX = xArray[0];
                    r1.positionY = yArray[0];
                    break;
                case 'R':
                    r1.right(ch);
                default:
                    System.out.println("Should not fall down into this");;
            };

        }
        String finalPosition = r1.outputFinalCoordinates(r1.positionX, r1.positionY, r1.directionFacing);
        System.out.println(finalPosition);

    }

}
