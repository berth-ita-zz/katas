package com.berta.katas.algorithms;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class RightTriangleTest {

    @Test
    public void printOneElementOkTest() {
        RightTriangle rightTriangle = new RightTriangle();
        String element = rightTriangle.getAsterisk();
        assertThat(element).isEqualTo("*");
    }

    @Test
    public void printThreeElementsOkTest() {
        RightTriangle rightTriangle = new RightTriangle();
        int number = 3;
        String line = rightTriangle.getAsterisksTriangle(number);
        assertThat(line).isEqualTo("*\n**\n***");
    }

}