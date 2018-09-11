package com.berta.katas.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsoscelesTriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce a number: ");
        int number = Integer.valueOf(bufferedReader.readLine());
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result = isoscelesTriangle.getAsterisksTriangle(number);
        System.out.println(result);
    }

    String getAsterisksTriangle(int number) {
        StringBuilder triangle = new StringBuilder();
        int base = calculateBase(number);
        for(int i = 1; i <= number; i++) {
            int asteriskNumber = 2 * i - 1;
            int blankNumber = (base - asteriskNumber) / 2;
            triangle.append(createTriangleLine(asteriskNumber, blankNumber));
            if(i != number) {
                triangle.append("\n");
            }
        }
        return triangle.toString();
    }

    String createTriangleLine(int asteriskNumber, int blankNumber){
        StringBuilder triangleLine = new StringBuilder();
        String blankSpaces = getCharacterXn(blankNumber,  " ");
        String asterisk = getCharacterXn(asteriskNumber, "*");
        return triangleLine.append(blankSpaces).append(asterisk).append(blankSpaces).toString();
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
