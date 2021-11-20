package com.example;

public class EjercicioSesion4 {

    public static void main(String[] args) {
        /*Ejercicio Sesión 4

        Ejercicio 1

        En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

        Agregaréis atributos tal cual tendrían esos objetos en la realidad.

        Crear constructor vacío y con todos los parámetros para cada clase.

        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/


        //crear objeto de la clase SmartPhone

        SmartPhone blackShark=new SmartPhone(); //sin atributos
        SmartPhone redmi=new SmartPhone(); //sin atributos

        SmartPhone blackShark2=new SmartPhone("Xiaomi","Qualcomm Snapdragon", 6, 128, "litio",
                "Cámara de fotografía urbana", 174.0, 159.2, "Android 11");

        SmartPhone redmi2=new SmartPhone("Xiaomi", "Qualcomm Snapdragon", 6, 128, "litio",
                "Cámara de 5MP", 130.0, 140.0, "Android 11");


        //Creamos los relojes
        SmartWatch samsungGalaxyWatch=new SmartWatch();
        SmartWatch amazFitGTR=new SmartWatch();

        SmartWatch samsungGalaxyWatch2=new SmartWatch("Samsung", 1, "100mAh", "rosa", 1.2, "Android 5.1", 199.9);
        SmartWatch amazFitGTR2=new SmartWatch("Amazon", 2, "200mAh", "negro", 1.4, "Android 4.4", 220.0);


        //Mostramos los teléfonos
        System.out.println("Teléfonos");
        System.out.println("Redmi sin datos "+redmi);
        System.out.println();
        System.out.println("Redmi con datos "+redmi2);

        //Mostramos los relojes
        System.out.println("Relojes");
        System.out.println();
        System.out.println("Samsung sin datos "+samsungGalaxyWatch);
        System.out.println("Samsung con datos "+samsungGalaxyWatch2);

    }
}
