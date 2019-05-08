package com.company;

public class Main {

    public static void main(String[] args) {

        long start;
        long finish;

        Task1 task1 = new Task1();
        start = System.currentTimeMillis();
        task1.addString("");
        finish = System.currentTimeMillis();
        System.out.println("Задание 1: ");
        System.out.println("time String = " + (finish - start));
        start = System.currentTimeMillis();
        task1.addStringBuilder("");
        finish = System.currentTimeMillis();
        System.out.println("time StringBuilder = " + (finish - start));

        Task2 task2 = new Task2(": ) :( ..:(...:(.34..(..)..qa..:)");
        System.out.println("Задание 2: ");
        task2.print();
        System.out.println(task2.replace());

        Task3 task3 = new Task3();
        System.out.println("Задание 3: " + task3.checkWord("Hello, World. Hello", "Hello"));

        Task4 task4 = new Task4();
        System.out.println("Задание 4: " + task4.generateFIO("Иванов", "иван", "Иванович"));

        Task5 task5 = new Task5();
        System.out.println("Задание 5: " + task5.wordCount(" Hello! my -  name is Boris !!!"));

        Task6 task6 = new Task6();
        System.out.println("Задание 6: " + task6.remoteRepeats("aaabbcdeefff"));

        Task7 t7 = new Task7();
        System.out.println("Задание 7: ");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            t7.getString(54321);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(t7.getString(54321));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            t7.getStringBuilder(54321);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(t7.getStringBuilder(54321));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            t7.getStringWithInt(54321);
        }
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(t7.getStringWithInt(54321));

    }
}
