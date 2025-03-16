import java.util.Random;
import java.util.Scanner;

public class Task027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите количество элементов в массиве: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Введите номер элемента который надо удалить:");
        int m = sc.nextInt();
        for (int i = m; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
