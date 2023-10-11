package com.example.oops.programs;

import com.example.oops.programs.Car;

public class SportsCar extends Car {
    //features of a sports car are listed here
    public String transmission(){ //Method Signature
        return "Sports Cars usually come with manual transmission";
    }

    public String pickup(){
        return "Sports car can go from 0 - 60 in 2 - 3 seconds.";
    }

    public String track(){
        return "To drive a sports car we need a race trac.";
    }
}
