package com.berta.katas.algorithms;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i = 1; i <= 100; i++) {
            String result = fizzBuzz.calculateFizzBuzz(i);
            System.out.println(result);
        }
    }

    public String calculateFizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if(number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
