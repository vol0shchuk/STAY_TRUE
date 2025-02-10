//Завдання 3

import java.util.*;

class Device {
    private String name;
    private int year;
    private double price;
    private String color;
    private String type;

    public Device(String name, int year, double price, String color, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Device{name='" + name + "', year=" + year + ", price=" + price + ", color='" + color + "', type='" + type + "'}";
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}

public class device {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Телевізор", 2020, 500, "чорний", "електроніка"));
        devices.add(new Device("Ноутбук", 2022, 1000, "сірий", "комп'ютер"));
        devices.add(new Device("Мобільний телефон", 2021, 700, "білий", "телефон"));
        devices.add(new Device("Пральна машина", 2019, 400, "синій", "побутова техніка"));

        devices.forEach(System.out::println);

        String color = "білий";
        devices.stream().filter(d -> d.getColor().equalsIgnoreCase(color)).forEach(System.out::println);

        int year = 2021;
        devices.stream().filter(d -> d.getYear() == year).forEach(System.out::println);

        double price = 600;
        devices.stream().filter(d -> d.getPrice() > price).forEach(System.out::println);

        String type = "електроніка";
        devices.stream().filter(d -> d.getType().equalsIgnoreCase(type)).forEach(System.out::println);

        int startYear = 2019, endYear = 2021;
        devices.stream().filter(d -> d.getYear() >= startYear && d.getYear() <= endYear).forEach(System.out::println);
    }
}
