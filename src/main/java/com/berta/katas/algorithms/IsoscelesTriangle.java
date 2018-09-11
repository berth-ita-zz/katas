package com.berta.katas.algorithms;

public class IsoscelesTriangle {

    public String getAsterisksTriangle(int number) {
        StringBuilder triangle = new StringBuilder();
        int base = calculateBase(number);
        for(int i = 1; i <= number; i++) {
            int asteriskNumber = 2 * i - 1;
            int blankNumber = base - asteriskNumber / 2;
            //pintar cadena
        }

        return triangle.toString();
    }

    public String createTriangleLine(int asteriskNumber, int blankNumber){

        return null;
    }

    public int calculateBase(int number) {
        int base = number * 2 - 1;
        return base;
    }

    public String getAsterisk() {
        return "*";
    }

}
