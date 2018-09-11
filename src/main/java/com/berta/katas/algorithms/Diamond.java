package com.berta.katas.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Diamond {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce a number: ");
        int number = Integer.valueOf(bufferedReader.readLine());
        Diamond diamond = new Diamond();
        String result = diamond.getAsterisksDiamond(number);
        System.out.println(result);
    }

    String getAsterisksDiamond(int number) {
        StringBuilder diamond = new StringBuilder();
        int base = calculateBase(number);
        for(int i = 1; i <= base; i++) {
            int asteriskNumber = 2 * i - 1;
            if(i > number) {
                asteriskNumber = 2 * (2 * number - i) - 1;
            }
            int blankNumber = (base - asteriskNumber) / 2;
            diamond.append(createDiamondLine(asteriskNumber, blankNumber));
            if(i != base) {
                diamond.append("\n");
            }
        }
        return diamond.toString();
    }

    String createDiamondLine(int asteriskNumber, int blankNumber){
        StringBuilder diamondLine = new StringBuilder();
        String blankSpaces = getCharacterXn(blankNumber,  " ");
        String asterisk = getCharacterXn(asteriskNumber, "*");
        return diamondLine.append(blankSpaces).append(asterisk).append(blankSpaces).toString();
    }

    private String getCharacterXn(int number, String character) {
        return IntStream.range(0, number).mapToObj(i -> character).collect(Collectors.joining());
    }

    int calculateBase(int number) {
        int base = number * 2 - 1;
        return base;
    }

    String getAsterisk() {
        return "*";
    }

}
