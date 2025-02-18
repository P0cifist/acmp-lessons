import java.util.Scanner;

public class Task005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 30000: ");
        int number = sc.nextInt();
        int numberForSum = 0;
        int sum = 0;
        do{
            numberForSum = number % 10;
            number = number / 10;
            sum += numberForSum;
        } while (number != 0);
        System.out.println("Сумма чисел из заданной строки " + sum);
    }
}
