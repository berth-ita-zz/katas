package com.berta.katas.algorithms;

public class VerticalLine {

    public static void main(String[] args) {
        VerticalLine verticalLine = new VerticalLine();
        String result = verticalLine.getAsterisksLine(3);
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
