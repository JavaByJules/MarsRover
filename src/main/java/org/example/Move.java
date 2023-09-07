package org.example;

public interface Move {
    public String left(String direction);
    public String right(String direction);
    public void moveX(int[] xArray, String direction);
    public void moveY(int[] xArray, String direction);
}
