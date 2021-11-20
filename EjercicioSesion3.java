package com.example;

public class EjercicioSesion3 {


    public static void main(String[] args) {


    /*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

    Tened en cuenta que los textos pueden venir de un array de tipo String.

    Por ejemplo: String[] nombres = {"", "", "", ""}
    */

        String [] stringArray={"Lorem", "ipsum", "dolor", "sit", "amet"};
        String concat="";

        for (int i = 0; i< stringArray.length; i++){
            System.out.println("String: "+stringArray[i]);
            concat+=stringArray[i];
        }
        System.out.println("El resultado del for es: "+concat);


        //for each
        concat="";
        for (String concatenar:stringArray) {
            concat+=concatenar;
            
        }
        System.out.println("El resultado del for each es: "+concat);


        //while
        concat="";
        int n = 0;

        while (n< stringArray.length){
            concat+=stringArray[n];
            n++;
        }
        System.out.println("El resultado del while es: "+concat);



        //do while
        concat="";
        int n1 = 0;

        do {
            concat+=stringArray[n1];
            n1++;
        }while(n1< stringArray.length);
        System.out.println("El resultado del do while es: "+concat);

    }

}
