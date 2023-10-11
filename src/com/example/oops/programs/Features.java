package com.example.oops.programs;

import com.example.oops.programs.Car;
import com.example.oops.programs.SportsCar;

public class Features {
    //Runnable class for both Car and SportCar classes
    public static void main(String[] args) {

        Car carobj = new Car();

        System.out.println("Comfort: "+carobj.comfort());
        System.out.println("Speed: "+carobj.speed());
        System.out.println("Seating: "+carobj.seating());

        SportsCar sportsobj = new SportsCar();

        System.out.println("Transmission: "+sportsobj.transmission());
        System.out.println("Speed from 0 - 60: "+sportsobj.pickup());
        System.out.println("Type of road to drive: "+sportsobj.track());
    }
}
