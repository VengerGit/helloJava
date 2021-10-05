package com.venger;
/*4)Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()*/

public class StringNumbers {
    public static void main(String[] args) {

        System.out.println(createString());
    }

    private static String createString() {
        StringBuilder strNumbers = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            strNumbers.append("(");
            strNumbers.append(i);
            strNumbers.append(")");
        }
        return strNumbers.toString();
    }
}