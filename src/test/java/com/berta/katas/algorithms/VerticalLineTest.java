package com.berta.katas.algorithms;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class VerticalLineTest {

    @Test
    public void printOneElementOkTest() {
        VerticalLine verticalLine = new VerticalLine();
        String element = verticalLine.getAsterisk();
        assertThat(element).isEqualTo("*");
    }

    @Test
    public void printThreeElementsOkTest() {
        VerticalLine verticalLine = new VerticalLine();
        int number = 3;
        String line = verticalLine.getAsterisksLine(number);
        assertThat(line).isEqualTo("*\n*\n*");
    }

}