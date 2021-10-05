package com.venger;

/*2) Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
        - если число кратно 3 то вместо него вывести Hello
        - если число кратно 5 то вместо него вывести World
        - если число кратно и 3 и 5 то вместо него вывести HelloWorld*/
public class NumbersFrom1to100 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ != 100) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.printf("%4d", i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("\t HelloWorld");
            } else {
                if (i % 3 == 0) {
                    System.out.print("\t Hello");
                }
                if (i % 5 == 0) {
                    System.out.print("\t World");
                }
            }
        }
    }
}