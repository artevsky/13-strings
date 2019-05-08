package com.company;

//Заменить все грустные смайлы :( в строке на весёлые :)

public class Task2 {

    private String str;

    public Task2(String str) {
        this.str = str;
    }

    public void print() {
        System.out.println(str);
    }

    public String replace() {
        String newStr = str.replaceAll(":\\(", ":)");
        return newStr;
    }
}
