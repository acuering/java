package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Primitive
        int wholeNumbers = 122;
        long LargeDecimalNumbers = -12;
        byte VariableRange = 123;
        short mediumRangeDecimalVariable = 32767;
        float numberWithDecimalPlaces = 8.3f;
        double largeNumberWithDecimalPlaces = 321321.3223;
        boolean check = true;
        char singleCharacter = '\u2511';

        // print all primitive types, output and run
        System.out.print(wholeNumbers);
        System.out.print(LargeDecimalNumbers);
        System.out.print(VariableRange);
        System.out.print(mediumRangeDecimalVariable);
        System.out.print(numberWithDecimalPlaces);
        System.out.print(largeNumberWithDecimalPlaces);
        System.out.println(check);
        System.out.print(singleCharacter);

        double doubleNumber;
        int i = 23;
        doubleNumber = i;
            System.out.print(doubleNumber);

            //switch case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


        //for loops

        for (int x = 0; x < 10; x++) {
            System.out.print(x);
        }
        //Arithmetic Operators

        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println(result);

        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a != 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

        a = 5;
        b = 2;
        if (a > b) {

            System.out.println("x is greater than y");
        }

        a = 5;
        b = 2;
        if (a < b) {

            System.out.println("x is greater than y");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // COMPOUND ASSIGNMENT OPERATORS
        int number = 5;
        number    +=  3;
        System.out.println(number);
        number    -=  3;
        System.out.println(number);
        number    *=  3;
        System.out.println(number);
        number    /=  3;
        System.out.println(number);
        number    %=  3;
        System.out.println(number);

        //INCREMENT AND DECREMENT OPERATORS
        int banana = 10;
        banana++;
        System.out.println(banana);

        int bananas= 20;
        bananas--;
        System.out.println(bananas);


        int incrementOp1 = 5;
        int incrementOp2 = 5;

        int incrementOp3 = incrementOp1 * incrementOp2++;
        System.out.println(incrementOp3);
        int incrementOp4 = incrementOp1 * --incrementOp2;
        System.out.println(incrementOp4);
    }
}
