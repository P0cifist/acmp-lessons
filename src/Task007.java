import java.util.Scanner;

public class Task007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N от 1: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Введите число K от 1 до 10000: ");
        int k = sc.nextInt();
        int sumOfN = 0;
        int numberForSum = 0;
        int number = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            number = i;
            sumOfN = 0;
            do{
                numberForSum = number % 10;
                number = number / 10;
                sumOfN += numberForSum;
            } while (number != 0);
            if (sumOfN%k == 0) {
                counter++;
            }
        }
        System.out.println("Количество чисел из диапазона от 1 до N включительно таких, что их сумма цифр делится на K: " + counter);
    }
}
