import java.util.Random;
import java.util.Scanner;

public class Task014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число от 1 до 100: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int number = n;
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[number - 1] + " ");
            number--;
        }
    }
}
