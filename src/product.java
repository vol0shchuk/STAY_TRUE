//Завдання 2

import java.util.*;

public class product {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("яблуко", "банан", "молоко", "апельсин", "картопля", "масло", "молоко", "хліб", "яблуко", "масло");

        System.out.println("Всі продукти:");
        products.forEach(System.out::println);

        System.out.println("\nПродукти з назвою менше 5 символів:");
        products.stream().filter(p -> p.length() < 5).forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведіть продукт для підрахунку:");
        String product = scanner.nextLine();
        long count = products.stream().filter(p -> p.equalsIgnoreCase(product)).count();
        System.out.println("Продукт '" + product + "' зустрічається " + count + " рази.");

        System.out.println("\nПродукти, що починаються на задану букву:");
        System.out.println("Введіть букву:");
        char letter = scanner.nextLine().charAt(0);
        products.stream().filter(p -> p.charAt(0) == letter).forEach(System.out::println);
    }
}
