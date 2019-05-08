package com.company;

//Написать функцию, принимающую 2 параметра:
// строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.

public class Task3 {
    public boolean checkWord(String string, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!(string.charAt(i) == word.charAt(i))) {
                return false;
            }
            int j = string.length() - word.length() + i;
            if (!(string.charAt(j) == word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}