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

        //for loops

        int sum = 0;
        int n = 1000;

        // for loop
        for (int k = 1; k <= n; ++k) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);

        int p = 5;

        // for loop
        for (int m = 1; m <= p; ++m) {
            System.out.println("Java is fun");
        }


        for (int x = 0; x < 10; x++) {
            System.out.print(x);
        }
        //Arithmetic Operators
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));
        // subtraction operator
        System.out.println("a - b = " + (a - b));
        // multiplication operator
        System.out.println("a * b = " + (a * b));
        // division operator
        System.out.println("a / b = " + (a / b));
        // modulo operator
        System.out.println("a % b = " + (a % b));

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

        byte b2 = 127;
        b2 %= 7;
        System.out.println(b2);
        byte b3 = 120;
        b3 &= 40;
        System.out.println(b3);
        short s1 = 300;
        s1 ^= 100;
        System.out.println(s1);
        byte b4 = 127;
        b4 >>= 3;
        System.out.println(b4);

        // Widening casting
        // byte -> short -> char -> int -> long -> float -> double

        short myShort = 9;
        double myDouble = myShort;

        System.out.println(myShort);
        System.out.println(myDouble);

         // Narrowing casting

        double mySecondDouble = 9.23;
        short mySecondShort = (short) mySecondDouble;

        System.out.println("mySecondDouble: " + mySecondDouble);
        System.out.println("mySecondShort: " + mySecondShort);


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

    }

}
