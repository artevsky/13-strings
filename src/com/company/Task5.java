package com.company;

//Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.

public class Task5 {

//    String text = "Привет ... !!! @@@";
//    int count = 0;
//    char space = ' ';
//
//    public int countOfWords() {
//        for (int i = 0; i < text.length() - 1; i++) {
//            if (text.charAt(i) == space && text.charAt(i + 1) != space) {
//                count++;
//            }
//        }
//        if (count != 0) {
//            count++;
//        }
//        return count;
//    }

    public static int wordCount(String s){
        int counter=0;
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))){
                counter++;
                for(;i<=s.length()-1;i++){
                    if(s.charAt(i)==' '){
                        i++;
                        break;
                    }
                }
            }
        }
        return counter;
    }

}
