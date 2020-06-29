package com.geekbrains.work5.massive;


import java.util.*;

public class WordsMassive {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Марина", "Роман", "Ольга", "Алексей", "Владимир",
                "Михаил", "Екатерина", "Татьяна", "Алексей", "Владимир",
                "Роман", "Ольга", "Алексей", "Екатерина", "Екатерина",
                "Ольга", "Алексей", "Екатерина", "Екатерина", "Алексей"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Сегодня посетили экспозицию");
        System.out.println(words.toString());
        System.out.println("Список посетителей");
        System.out.println(unique.toString());
        System.out.println("Количество посещений");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
