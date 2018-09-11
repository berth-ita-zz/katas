package com.berta.katas.algorithms;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    public void primeFactorsWithNumberOneOkTest() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> factors = primeFactors.calculatePrimeFactors(1);
        assertThat(factors).isEmpty();
    }

    @Test
    public void primeFactorsWithNumberThirtyOkTest() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> factors = primeFactors.calculatePrimeFactors(30);
        assertThat(factors).hasSameElementsAs(Arrays.asList(2, 3, 5));
    }
}