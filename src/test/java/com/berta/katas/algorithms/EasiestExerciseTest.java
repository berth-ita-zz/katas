package com.berta.katas.algorithms;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class EasiestExerciseTest {

    @Test
    public void printAsteriskOkTest() {
        EasiestExercise easiestExercise = new EasiestExercise();
        String asterisk = easiestExercise.getAsterisk();
        assertThat(asterisk).isEqualTo("*");
    }

}