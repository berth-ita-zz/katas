package com.berta.katas.algorithms;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;


public class FizzBuzzTest {

    @Test
    public void numberMultipleOfThree() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void numberMultipleOfFive() {
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void numberMultipleOfThreeAndFive() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void numberNotMultipleOfThreeOrFive() {
        int number = 4;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo(String.valueOf(number));
    }
}