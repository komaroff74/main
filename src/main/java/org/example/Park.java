package org.example;

public class Park { private String name;
    public Park(String name) {
        this.name = name;
    }
    public class Attraction {
        private String attractionName;
        private String time;
        private int price;

        public Attraction(String attractionName, String time, int price) {
            this.attractionName = attractionName;
            this.time = time;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк Гагарина");
        Attraction icerinc = park.new Attraction("Каток ", "10:00 - 18:00", 100);
        Attraction rain = park.new Attraction("Паровоз ", "10:00 - 18:00", 200);
        Attraction shootinggallery = park.new Attraction("Тир ", "10:00 - 18:00", 300);


        System.out.println("Название  " + icerinc.attractionName);
        System.out.println("Время работы " + icerinc.time);
        System.out.println("Цена " + icerinc.price);
        System.out.println("------------------");
        System.out.println("Название  " + rain.attractionName);
        System.out.println("Время работы " + rain.time);
        System.out.println("Цена " + rain.price);
        System.out.println("------------------");
        System.out.println("Название  " + shootinggallery.attractionName);
        System.out.println("Время работы " + shootinggallery.time);
        System.out.println("Цена " + shootinggallery.price);

    }
}
