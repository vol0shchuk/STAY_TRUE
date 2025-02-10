import java.util.*;

class Projector {
    private String name;
    private int year;
    private double price;
    private String manufacturer;

    public Projector(String name, int year, double price, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Projector{name='" + name + "', year=" + year + ", price=" + price + ", manufacturer='" + manufacturer + "'}";
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

public class projector {
    public static void main(String[] args) {
        List<Projector> projectors = new ArrayList<>();
        projectors.add(new Projector("Проектор 1", 2021, 1200, "Samsung"));
        projectors.add(new Projector("Проектор 2", 2022, 1500, "LG"));
        projectors.add(new Projector("Проектор 3", 2023, 1300, "Sony"));
        projectors.add(new Projector("Проектор 4", 2021, 1100, "Epson"));

        // Вивести всі проектори
        projectors.forEach(System.out::println);

        // Вивести проектори одного виробника
        String manufacturer = "Samsung";
        projectors.stream().filter(p -> p.getManufacturer().equalsIgnoreCase(manufacturer)).forEach(System.out::println);

        // Вивести проектори поточного року
        int currentYear = 2023;
        projectors.stream().filter(p -> p.getYear() == currentYear).forEach(System.out::println);

        // Вивести проектори вище вказаної ціни
        double price = 1200;
        projectors.stream().filter(p -> p.getPrice() > price).forEach(System.out::println);
    }
}
