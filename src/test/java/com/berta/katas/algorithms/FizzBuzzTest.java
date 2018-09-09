package com.berta.katas.algorithms;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;


public class FizzBuzzTest {

    @Test
    public void numberMultipleOfThreeReturnFizzTest() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void numberMultipleOfFiveReturnBuzzTest() {
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void numberMultipleOfThreeAndFiveReturnFizzBuzzOkTest() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void numberNotMultipleOfThreeOrFiveReturnNumberTest() {
        int number = 4;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.calculateFizzBuzz(number);
        assertThat(result).isEqualTo(String.valueOf(number));
    }
}