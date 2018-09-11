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
    public void calculateBaseOkTest() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        int number = 3;
        int base = isoscelesTriangle.calculateBase(number);
        assertThat(base).isEqualTo(5);
    }

    @Test
    public void printTriangleLineOkTest() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        int asteriskNumber = 1;
        int blankNumber = 2;
        String line = isoscelesTriangle.createTriangleLine(asteriskNumber, blankNumber);
        assertThat(line).isEqualTo("  *  ");
    }

    @Test
    public void printTriangleOkTest() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        int number = 3;
        String line = isoscelesTriangle.getAsterisksTriangle(number);
        assertThat(line).isEqualTo("  *  \n *** \n*****");
    }

}