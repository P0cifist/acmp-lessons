import java.util.Arrays;
import java.util.Scanner;

public class Task012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        String x = sc.nextLine();
        String[] arr = x.split(" ");
        int min, y, z;
        y = Integer.parseInt(arr[0]);
        z = Integer.parseInt(arr[1]);
        if (y > z) {
            min = z;
        } else {
            min = y;
        }
        int NOD = 0;
        for (int i = 1; i < min; i++) {
            if (y % i == 0 && z % i == 0) {
                NOD = i;
            }
        }
        System.out.println(NOD);
    }
}
