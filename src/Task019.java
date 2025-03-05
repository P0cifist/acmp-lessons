import java.util.Random;
import java.util.Scanner;

public class Task019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(10);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        boolean sameNumbers = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j] && i != j && !sameNumbers) {
                    System.out.println();
                    System.out.print(i + 1);
                    System.out.print(" ");
                    System.out.print(j + 1);
                    sameNumbers = true;
                }
            }
        }
        if (!sameNumbers) {
            System.out.println();
            System.out.println("0 0");
        }
    }
}
