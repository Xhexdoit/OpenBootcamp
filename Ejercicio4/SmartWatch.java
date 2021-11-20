package com.example;

public class SmartWatch extends SmartDevice{

    String brand;
    int capacity;
    String battery;
    String color;
    double inches;
    String so;
    double price;


    //constructor vacío
    public SmartWatch() {

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", battery='" + battery + '\'' +
                ", color='" + color + '\'' +
                ", inches=" + inches +
                ", so='" + so + '\'' +
                ", price=" + price +
                '}';
    }

    //Crear constructor con los atributos de la clase
    public SmartWatch(String brand, int capacity, String battery, String color, double inches, String so, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.battery = battery;
        this.color = color;
        this.inches = inches;
        this.so = so;
        this.price = price;





    }
}
