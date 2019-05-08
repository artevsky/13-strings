package com.company;

//Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате "Ф.И.О".
// Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.

public class Task4 {

    public StringBuilder generateFIO(String name, String surname, String patronymic) {
        StringBuilder fioSB = new StringBuilder();
        fioSB.append(surname.toUpperCase().charAt(0));
        fioSB.append(name.toUpperCase().charAt(0));
        fioSB.append(patronymic.toUpperCase().charAt(0));

        return fioSB;
    }
}
