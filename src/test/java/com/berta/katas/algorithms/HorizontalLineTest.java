package com.berta.katas.algorithms;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class HorizontalLineTest {

    @Test
    public void printOneElementOkTest() {
        HorizontalLine horizontalLine = new HorizontalLine();
        String element = horizontalLine.getAsterisk();
        assertThat(element).isEqualTo("*");
    }

    @Test
    public void printEightElementsOkTest() {
        HorizontalLine horizontalLine = new HorizontalLine();
        int number = 8;
        String line = horizontalLine.getAsterisksLine(number);
        assertThat(line).isEqualTo("********");
    }

    @Test
    public void printZeroElementsOkTest() {
        HorizontalLine horizontalLine = new HorizontalLine();
        int number = 0;
        String line = horizontalLine.getAsterisksLine(number);
        assertThat(line).isEqualTo("");
    }
}