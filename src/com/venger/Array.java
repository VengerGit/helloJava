package com.venger;
/*3)Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.*/

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        double average = 0;
        for (int j : array) {
            average += j;
        }
        System.out.printf("Среднее арифметическое масива = %.2f", average / array.length);
    }
}