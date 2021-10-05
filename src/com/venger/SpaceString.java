package com.venger;

/*5)Написать метод который убирает лишние пробелы в строке и возвращает строку.*/
public class SpaceString {
    public static void main(String[] args) {
        String str = " Мы   поставили       кучу  пробелов  но Джава  их   убрала.    ";
        System.out.println(deleteSpace(str));
    }

    public static String deleteSpace(String str) {
        return str.trim().replaceAll(" +", " ");
    }
}