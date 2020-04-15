package com.bereket;

public class Door {
    private boolean doorOpen;

    public Door(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpenControl(boolean openOrClosed) {
        this.doorOpen = openOrClosed;
    }
}
