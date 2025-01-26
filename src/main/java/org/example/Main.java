package org.example;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Риц");

        Cat cat1 = new Cat("Соня");
        Cat cat2 = new Cat("Мурка");
        Cat cat3 = new Cat("Ночька");

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        dog1.run(300);
        dog1.swim(5);

        dog2.run(600);
        dog2.swim(15);

        cat1.run(150);
        cat1.swim(10);

        Bowl bowl = new Bowl(20);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");

        bowl.addFood(15);
        System.out.println("Добавили еды. Теперь в миске: " + bowl.getFood() + " ед.");

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт: " + cat.isFull());
            }
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");
        System.out.println("***********");


        System.out.println("Задание №2");

        Shape circle = new Circle(3, "Красный ", " Серый");
        Shape rectangle = new Rectangle(2, 4, "Белый", "Желтый");
        Shape triangle = new Triangle(5, 6, 3, "Фиолетовый", "Зеленый");


        System.out.println("Круг:");
        circle.printCharacteristics();
        System.out.println("-----------------");

        System.out.println("Прямоугольник:");
        rectangle.printCharacteristics();
        System.out.println("-----------------");

        System.out.println("Треугольник:");
        triangle.printCharacteristics();
        System.out.println("-----------------");
    }
}


