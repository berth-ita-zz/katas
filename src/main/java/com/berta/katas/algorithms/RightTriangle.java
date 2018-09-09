package com.berta.katas.algorithms;

public class RightTriangle {

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        String result = rightTriangle.getAsterisksTriangle(3);
        System.out.println(result);
    }

    public String getAsterisksTriangle(int number) {
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

    public String getAsterisk() {
        return "*";
    }
}
