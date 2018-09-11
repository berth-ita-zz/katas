package com.berta.katas.algorithms;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class DiamondTest {

    @Test
    public void printOneElementOkTest() {
        Diamond diamond = new Diamond();
        String element = diamond.getAsterisk();
        assertThat(element).isEqualTo("*");
    }

    @Test
    public void calculateBaseOkTest() {
        Diamond diamond = new Diamond();
        int number = 3;
        int base = diamond.calculateBase(number);
        assertThat(base).isEqualTo(5);
    }

    @Test
    public void printTriangleLineOkTest() {
        Diamond diamond = new Diamond();
        int asteriskNumber = 1;
        int blankNumber = 2;
        String line = diamond.createDiamondLine(asteriskNumber, blankNumber);
        assertThat(line).isEqualTo("  *  ");
    }

    @Test
    public void printDiamondOkTest() {
        Diamond diamond = new Diamond();
        int number = 3;
        String line = diamond.getAsterisksDiamond(number);
        assertThat(line).isEqualTo("  *  \n *** \n*****\n *** \n  *  ");
    }

}