import java.util.Random;
import java.util.Scanner;

public class Task021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n;
        do {
            System.out.println("Введите количество чисел не больше 100");
            n = sc.nextInt();
        } while (n > 100);
        int number;
        int[] arr = new int[9];
        for (int i = 0; i < n; i++) {
            number = rand.nextInt(10);
            if (number == 1) {
                arr[0]++;
            } else if (number == 2) {
                arr[1]++;
            } else if (number == 3) {
                arr[2]++;
            } else if (number == 4) {
                arr[3]++;
            } else if (number == 5) {
                arr[4]++;
            } else if (number == 6) {
                arr[5]++;
            } else if (number == 7) {
                arr[6]++;
            } else if (number == 8) {
                arr[7]++;
            } else if (number == 9) {
                arr[8]++;
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
