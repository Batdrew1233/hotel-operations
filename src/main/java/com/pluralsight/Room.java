package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private long price;
    private boolean Occupied;
    private boolean dirty;
    private boolean available;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public long getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }
}
