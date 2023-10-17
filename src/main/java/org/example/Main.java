package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var myVolvo = new Car("Volvo", "S90", 2023);

        System.out.println(myVolvo);

        var db = new Database();

        var res = db.saveCar (myVolvo);

        if (res) {
            System.out.println("Car saved!");
        } else {
            System.out.println("Car not saved!");

        }


    }
}