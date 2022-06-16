package com.patika.dev;

public class ArrayHarmonic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonic = 1.0;
        for (int i = 0; i < numbers.length; i++) {
            harmonic += 1/numbers[i];
        }

        System.out.println( numbers.length / harmonic);
    }
}
