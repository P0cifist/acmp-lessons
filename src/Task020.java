import java.util.Random;
import java.util.Scanner;

public class Task020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Введите количество отрезков (N): ");
        int N = scanner.nextInt();


        int maxLeft = Integer.MIN_VALUE;
        int minRight = Integer.MAX_VALUE;


        System.out.println("Сгенерированные отрезки:");
        for (int i = 0; i < N; i++) {

            int left = random.nextInt(10);

            int right = left + 1 + random.nextInt(10 - left);


            System.out.println(left + " " + right);


            if (left > maxLeft) {
                maxLeft = left;
            }
            if (right < minRight) {
                minRight = right;
            }
        }


        int commonLength = Math.max(0, minRight - maxLeft);


        System.out.println("Длина общей части всех отрезков: " + commonLength);
    }
}
