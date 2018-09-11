package com.berta.katas.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce a number: ");
        int number = Integer.valueOf(bufferedReader.readLine());
        RightTriangle rightTriangle = new RightTriangle();
        String result = rightTriangle.getAsterisksTriangle(number);
        System.out.println(result);
    }

    String getAsterisksTriangle(int number) {
        StringBuilder triangle = new StringBuilder();
        for(int i = 0; i < number; i++) {
            if(i != 0) {
                triangle.append("\n");
            }
            triangle.append(getAsterisksLine(i));
        }

        return triangle.toString();
    }

    private String getAsterisksLine(int number) {
        StringBuilder line = new StringBuilder();
        for(int j = 0; j <= number; j++) {
            line.append(getAsterisk());
        }
        return line.toString();
    }

    String getAsterisk() {
        return "*";
    }
}
