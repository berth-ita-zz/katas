package com.berta.katas.algorithms;

public class HorizontalLine {

    public static void main(String[] args) {
        HorizontalLine horizontalLine = new HorizontalLine();
        String result = horizontalLine.getAsterisksLine(8);
        System.out.println(result);
    }

    public String getAsterisksLine(int number) {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < number; i++) {
            line.append(getAsterisk());
        }

        return line.toString();
    }

    public String getAsterisk() {
        return "*";
    }

}
