package com.company;

//Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями. Если число выходит за размер 10 символов вернуть все нули.
//Пример getString(22) -> 0000000022
//Yайти 3 способа решения задачи и определить наиболее быстрый способ.

public class Task7 {

    public String getString(long number) {
        String str = String.valueOf(number);
        if (number < 10000000000L) {
            while (str.length() != 10) {
                str = "0" + str;
            }
        } else str.substring(str.length() - 10);
        return str;
    }

    public StringBuilder getStringBuilder(long number) {
        StringBuilder str = new StringBuilder(String.valueOf(number));
        str.reverse();
        if (number < 10000000000L) {
            while (str.length() != 10) {
                str.append('0');
            }
            str.reverse();
        } else str.substring(str.length() - 10);
        return str;
    }

    public StringBuilder getStringWithInt(long number) {
        number += 10000000000L;
        StringBuilder str = new StringBuilder(String.valueOf(number));
        str.deleteCharAt(0);
        return str;
    }
}
