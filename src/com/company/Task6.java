package com.company;

//Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
//
//Пример: aaabbcdeef ->abcdef

public class Task6 {
//    String string = "aaabbcdeefff";

    public StringBuilder remoteRepeats(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        int stringLength = string.length();
        for(int i = 0; i < stringLength - 1; i++){
            if(stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)){
                stringBuilder.deleteCharAt(i);
                i--;
                stringLength--;
            }
        }
        return stringBuilder;
    }
}
