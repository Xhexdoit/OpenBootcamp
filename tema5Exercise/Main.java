package com.example.tema5Exercise;

public class Main {

    public static void main(String[] args) {
        CocheCRUDImpl c1 = new CocheCRUDImpl();

        c1.save();
        c1.delete();
        c1.findAll();
    }
}
