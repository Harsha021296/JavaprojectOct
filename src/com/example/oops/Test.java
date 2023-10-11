package com.example.oops;

public class Test {
    public static void main(String[] args) {

        calculator calcObj = new calculator();

        calcObj.firstNumber = 25;
        calcObj.secondNumber = 13;

        System.out.println("Add: " + calcObj.add());
        System.out.println("Subtract: " + calcObj.subtract());
        System.out.println("Multiply: " + calcObj.multiply());
        System.out.println("Divide: " + calcObj.divide());


    AdvancedCalculator advCalc = new AdvancedCalculator();//Obj Creation

  //  public AdvancedCalculator getadvCalc() {
        advCalc.firstNumber = 10;
        advCalc.secondNumber = 15;
        advCalc.angle = 30;
    //    }

        System.out.println("ADDITION RESULT: "+advCalc.add());
        System.out.println("SUBTRACTION RESULT: "+advCalc.subtract());
        System.out.println("MULTIPLICATION RESULT: "+advCalc.multiply());
        System.out.println("DIVISION RESULT: "+advCalc.divide());
        System.out.println("SINE RESULT: "+advCalc.sineAngle());
        System.out.println("COSINE RESULT: "+advCalc.cosineAngle());
        System.out.println("TANGENT RESULT: "+advCalc.tangentAngle());
    }
}

