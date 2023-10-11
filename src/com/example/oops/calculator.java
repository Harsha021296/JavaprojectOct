package com.example.oops;

public class calculator {
    public double firstNumber;
    public double secondNumber;

    public double add(){ //Method Signature
        double result = firstNumber + secondNumber; //local variable
        return result;
    }

    public double subtract(){
        return firstNumber - secondNumber;
    }

    public double multiply(){
        return firstNumber * secondNumber;
    }

    public double divide(){
        return firstNumber / secondNumber;
    }
}
