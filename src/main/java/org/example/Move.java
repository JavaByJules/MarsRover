package org.example;

public interface Move {
    public Character left(Character direction);
    public Character right(Character direction);
    public void moveVehicle(int[] xArray, int [] yArray, Character direction);
}
