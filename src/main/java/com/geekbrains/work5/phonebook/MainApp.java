package com.geekbrains.work5.phonebook;

public class MainApp {
    public static void main(String[] args){
        Phonebook phonebook = new Phonebook();

        phonebook.add(1348569, "Шахов");
        phonebook.add(8995563, "Шахов");
        phonebook.add(9874524, "Траум");
        phonebook.add(9874525, "Траум");
        phonebook.add(9874526, "Козак");
        phonebook.add(9874514, "Секундант");
        phonebook.add(5862412, "Секундант");
        phonebook.add(6542389, "Секундант");

        phonebook.get("Шахов");
        phonebook.get("Траум");
        phonebook.get("Секундант");
        phonebook.get("Козак");
        phonebook.get("Невзоров");


    }
}

