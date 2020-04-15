package com.bereket;

public class Main {

    public static void main(String[] args) {

        Door door1 = new Door(true);
        LightSwitch room1 = new LightSwitch(true);
        LightSwitch livingRoom = new LightSwitch(true);
        Door frontDoor = new Door(false);
        Alexa room3 = new Alexa(livingRoom, door1);
    }

}
