package com.bereket;

public class LightSwitch {
    private boolean lightOn;

    public LightSwitch(boolean lightOn) {
        this.lightOn = lightOn;
    }

    public boolean isLightOn() {
        return lightOn;
    }

    public void setLightControl(boolean onOrOff) {
        this.lightOn = onOrOff;
    }



}