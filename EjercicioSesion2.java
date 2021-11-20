package com.example;

import java.util.Scanner;

public class EjercicioSesion2 {



    public static void finalPrice(){
        System.out.println("Introduce un precio: ");
        Scanner input=new Scanner(System.in);
        int price=input.nextInt();
        System.out.println("Introduzca el importe del IVA: ");
        int iva=input.nextInt();
        int finalPrice=price+(price*iva/100);
        System.out.println("El precio final es: "+finalPrice);



    }

    public static void main(String[] args) {
    finalPrice();
    }


}
