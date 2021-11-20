package com.example;

public class SmartPhone extends SmartDevice{
    String brand;
    String CPU;
    int RAM;
    int capacity;
    String battery;
    String camera;
    double weight;
    double length;
    String os;

    //Crear constructor vacío

    public SmartPhone() {
    }

    //Crear constructor con los atributos de la clase.
    public SmartPhone(String brand, String CPU, int RAM, int capacity, String battery, String camera, double weight, double length, String os) {
        this.brand = brand;
        this.CPU = CPU;
        this.RAM = RAM;
        this.capacity = capacity;
        this.battery = battery;
        this.camera = camera;
        this.weight = weight;
        this.length = length;
        this.os = os;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", capacity=" + capacity +
                ", battery='" + battery + '\'' +
                ", camera='" + camera + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", os='" + os + '\'' +
                '}';
    }
}
