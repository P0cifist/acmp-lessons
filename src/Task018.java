import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        int pairCount = 0;
        int currentCount = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(10);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentCount++;
            }
        }
        System.out.println(currentCount);
    }
}