package org.example.OneThousanddigitFibonacciNumber;

public class OneThousanddigitFibonacciNumber {

    public static int fibonnaci2(int number){
        int counter = 1;
        int fibonnaci = 0;

        for (counter = 1; howManyDigitsHasNumber(fibonnaci) < number; counter++) {
            fibonnaci = fibonnaci(counter);
        }

        return counter - 1;
    }

    public static int fibonnaci(int number){
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return fibonnaci(number - 1) + fibonnaci(number - 2);
    }

    private static int howManyDigitsHasNumber(int number) {
        int digits = 0;
        int temp = number;

        while (temp > 0){
            digits++;
            temp /= 10;
        }
        return digits;
    }
}
