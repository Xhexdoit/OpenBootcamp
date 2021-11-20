package com.example;

public class SmartDevice {
    int numCameras;
    int inchesScreen;
    boolean googlePlay;
    int capacity;
    boolean bluetooth;


    //crear constructor vacío


    public SmartDevice() {
    }

    //crear constructor con atributos

    public SmartDevice(int numCameras, int inchesScreen, boolean googlePlay, int capacity, boolean bluetooth) {
        this.numCameras = numCameras;
        this.inchesScreen = inchesScreen;
        this.googlePlay = googlePlay;
        this.capacity = capacity;
        this.bluetooth = bluetooth;
    }
}
