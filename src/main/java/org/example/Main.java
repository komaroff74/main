package org.example;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            String[] text = {"Привет", "Вася", "как", "у", "тебя", "дела", "Привет", "Дела", "так", "же", "как", "и", "у", "тебя"};
            List<String> textList = new ArrayList<>();
            textList.add("Привет");
            textList.add("Вася");
            textList.add("как");
            textList.add("у");
            textList.add("тебя");
            textList.add("дела");
            textList.add("Привет");
            textList.add("дела");
            textList.add("так");
            textList.add("же");
            textList.add("как");
            textList.add("и");
            textList.add("у");
            textList.add("тебя");
            Set<String> cal = new HashSet<String>(textList);

            for (String world : cal) {
                System.out.println(world + ": " + Collections.frequency(textList, world) + " повторения");
            }

            PhoneBook phonebook = new PhoneBook();

            phonebook.add("Иванов", "8(900)111-11-11");
            phonebook.add("Петров", "8(900)222-22-22");
            phonebook.add("Сидоров", "8(900)333-33-33");
            phonebook.add("Сидоров", "8(900)444-44-44");
            phonebook.add("Иванов", "8(900)555-55-55");
            phonebook.add("Кремлев", "8(900)666-66-66");
            phonebook.add("Костин", "8(900)777-77-77");
            phonebook.add("Дуров", "8(900)888-88--88");

            System.out.println("телефон : " + phonebook.get("Сидоров"));
        }
    }



