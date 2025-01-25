package org.example;

public class Person {
    private String fio;
    private String email;
    private String job;
    private String phone;
    private int bonus;
    private int age;

    public Person(String fio, String job, String email, String phone, int bonus, int age) {
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.phone = String.valueOf(phone);
        this.bonus = bonus;
        this.age = age;

        System.out.println("ФИО :"+ fio);
        System.out.println("почта :" + email);
        System.out.println("должность :" + job);
        System.out.println("тел. :" + phone);
        System.out.println("ЗП :" + bonus);
        System.out.println("Возраст :" + age + "лет");
        System.out.println("----------");


    }
}
