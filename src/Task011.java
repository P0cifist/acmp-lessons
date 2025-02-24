import java.util.Random;
import java.util.Scanner;

public class Task011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число от 1 до 10: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] == i + 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
