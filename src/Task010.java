import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Task010 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите количество чисел в последовательности от 1 до 10000: ");
            n = sc.nextInt();
        } while (n > 10000 || n < 1);
        int[] maxNumber = new int[n];
        for (int i = 0; i < n; i++) {
            maxNumber[i] = rand.nextInt(10);
        }
        int max = Arrays.stream(maxNumber).max().getAsInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (maxNumber[i] == max) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
