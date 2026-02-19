package io.hexlet;

public class Quadrate implements Geometric {
    private int side;

    public Quadrate(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "quadrate";
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}