package com.berta.katas.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorizontalLine {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce a number: ");
        int number = Integer.valueOf(bufferedReader.readLine());
        HorizontalLine horizontalLine = new HorizontalLine();
        String result = horizontalLine.getAsterisksLine(number);
        System.out.println(result);
    }

    String getAsterisksLine(int number) {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < number; i++) {
            line.append(getAsterisk());
        }

        return line.toString();
    }

    String getAsterisk() {
        return "*";
    }

}
