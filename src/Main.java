//Завдання 1

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        int positiveCount = 0, negativeCount = 0, twoDigitCount = 0, mirrorCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200) - 100; // Генерація числа від -100 до 99
        }

        for (int num : numbers) {
            if (num > 0) positiveCount++;
            if (num < 0) negativeCount++;
            if (Math.abs(num) >= 10 && Math.abs(num) <= 99) twoDigitCount++;
            if (isMirror(num)) mirrorCount++;
        }

        System.out.println("Кількість додатних: " + positiveCount);
        System.out.println("Кількість від'ємних: " + negativeCount);
        System.out.println("Кількість двозначних: " + twoDigitCount);
        System.out.println("Кількість дзеркальних чисел: " + mirrorCount);
    }

    public static boolean isMirror(int num) {
        String numStr = Integer.toString(Math.abs(num));
        StringBuilder sb = new StringBuilder(numStr);
        return numStr.equals(sb.reverse().toString());
    }
}
