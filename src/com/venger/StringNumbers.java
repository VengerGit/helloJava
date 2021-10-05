package com.venger;
/*4)Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()*/

public class StringNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            StringBuilder strNumbers = new StringBuilder();
            strNumbers.append(i);
            System.out.printf("(%s)", strNumbers);
        }
    }
}