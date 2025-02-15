import java.util.Scanner;

public class Task0001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число А - ");
        int a = scanner.nextInt();
        System.out.print("Введите число B - ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("A + B = " + sum);
    }
}
