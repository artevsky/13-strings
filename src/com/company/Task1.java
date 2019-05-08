package com.company;

//Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.

public class Task1 {
    public String addString(String str) {
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        return str;
    }

    public StringBuilder addStringBuilder(String strB) {
        StringBuilder stringBuilder = new StringBuilder(strB);
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
        }
        return stringBuilder;
    }
}
