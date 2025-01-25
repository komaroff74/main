package org.example;
public class Main {
    public static void main(String[] args) {

        Person[] perArray = new Person[5];

        perArray[0] = new Person("Иванов Иван Иванович", "Инженер", "ivan@mailbox.com", "2222222", 10_000, 20);
        perArray[1] = new Person("Иванов Иван Сергеевич ", "Архитектор", "ivan@mail.com", "3333333", 20_000, 30);
        perArray[2] = new Person("Иванов Иван Максимович", "Конструктор", "ivan@mail.ru", "4444444", 30_000, 40);
        perArray[3] = new Person("Иванов Иван Федорович", "Механик", "ivan@mail.com", "5555555", 40_000, 50);
        perArray[4] = new Person("Иванов Иван Степанович", "Техник", "ivan@maik.com", "6666666", 50_000, 60);

    }

}

