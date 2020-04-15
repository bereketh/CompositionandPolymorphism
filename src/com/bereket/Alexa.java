package com.bereket;

public class Alexa {
    private LightSwitch lightSwitch;
    private Door door;

    public Alexa(LightSwitch lightSwitch, Door door) {
        this.lightSwitch = lightSwitch;
        this.door = door;
    }

    public LightSwitch getLightSwitch() {
        return lightSwitch;
    }

    public void setLightSwitch(LightSwitch lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
    public void lightControl (String onOrOff){
        if (onOrOff.equals("on")) {
            this.lightSwitch.setLightControl(true);
            System.out.println("light is on");
        }
        else if (onOrOff.equals("off")) {
            this.lightSwitch.setLightControl(false);
            System.out.println("light is off");
        }
    }
    public void doorControl (String openOrClosed){
        if (openOrClosed.equals("open")) {
            this.door.setDoorOpenControl(true);
            System.out.println("door is open");
        }
        else if (openOrClosed.equals("closed")){
            this.door.setDoorOpenControl(false);
            System.out.println("door is closed");
        }
    }
}
