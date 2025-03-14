import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
        Arrays.sort(arr);
        System.out.println(arr[n - 1] + " " + arr[n - 2] + " " + arr[n - 3]);
    }
}
