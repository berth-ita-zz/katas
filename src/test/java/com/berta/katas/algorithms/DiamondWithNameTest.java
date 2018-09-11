package com.berta.katas.algorithms;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class DiamondWithNameTest {

    @Test
    public void printOneElementOkTest() {
        DiamondWithName diamondWithName = new DiamondWithName();
        String element = diamondWithName.getAsterisk();
        assertThat(element).isEqualTo("*");
    }

    @Test
    public void calculateBaseOkTest() {
        DiamondWithName diamondWithName = new DiamondWithName();
        int number = 3;
        int base = diamondWithName.calculateBase(number);
        assertThat(base).isEqualTo(5);
    }

    @Test
    public void printDiamondLineOkTest() {
        DiamondWithName diamondWithName = new DiamondWithName();
        int asteriskNumber = 1;
        int blankNumber = 2;
        String line = diamondWithName.createDiamondLine(asteriskNumber, blankNumber);
        assertThat(line).isEqualTo("  *  ");
    }

    @Test
    public void printDiamondOkTest() {
        DiamondWithName diamondWithName = new DiamondWithName();
        int number = 3;
        String line = diamondWithName.getAsterisksDiamond(number);
        assertThat(line).isEqualTo("  *  \n *** \nBerta\n *** \n  *  ");
    }

}