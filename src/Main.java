import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    public static int[] generateRandomArray(int lengthOfArray) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray(30);
        int totalSpendings = 0;

        for (int k : arr) {
            totalSpendings += k;
        }
        System.out.println("Сумма трат за месяц составила: " + totalSpendings + " рублей.");

        System.out.println("\nЗадание 2");
        int maxSpendings = arr[0];
        int minSpendings = arr[0];

        for (int j : arr) {
            if (j < minSpendings) {
                minSpendings = j;
            }
            if (j > maxSpendings) {
                maxSpendings = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minSpendings + " рублей.");
        System.out.println("Максимальная сумма трат за день составила: " + maxSpendings + " рублей.");

        System.out.println("\nЗадание 3");
        float medSpending = 0.0f;
        medSpending = totalSpendings/(float)arr.length;
        System.out.println("Средняя сумма трат за день составила: " + medSpending + " рублей.");
    }

}