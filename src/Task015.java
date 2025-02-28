import java.util.Random;
import java.util.Scanner;

public class Task015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        int[] copyArr = new int[x];
        int notEven = 0;
        int lastNotEven = 0;

        for (int i = 0; i < x; i++) {
            arr[i] = rand.nextInt(100);
        }
        for (int i = 0; i < x; i++) {
            copyArr[i] = arr[i];
        }
        for (int i = 0; i < x; i++) {
            if (arr[i] % 2 != 0) {
                copyArr[lastNotEven] = arr[i];
                lastNotEven++;
            }
        }
        for (int i = 0; i < x; i++) {
            if (arr[i] % 2 == 0) {
                copyArr[lastNotEven] = arr[i];
                lastNotEven++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }
}
