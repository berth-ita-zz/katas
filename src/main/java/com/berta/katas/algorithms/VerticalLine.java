package com.berta.katas.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerticalLine {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce a number: ");
        int number = Integer.valueOf(bufferedReader.readLine());
        VerticalLine verticalLine = new VerticalLine();
        String result = verticalLine.getAsterisksLine(number);
        System.out.println(result);
    }

    public String getAsterisksLine(int number) {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < number; i++) {
            if(i != 0) {
                line.append("\n");
            }
            line.append(getAsterisk());

        }

        return line.toString();
    }

    public String getAsterisk() {
        return "*";
    }

}
