package com.berta.katas.algorithms;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class IsoscelesTriangleTest {

    @Test
    public void printOneElementOkTest() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String element = isoscelesTriangle.getAsterisk();
        assertThat(element).isEqualTo("*");
    }

    @Test
    public void printTriangleOkTest() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        int number = 5;
        String line = isoscelesTriangle.getAsterisksTriangle(number);
        assertThat(line).isEqualTo("  *  \n *** \n*****");
    }

}