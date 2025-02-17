import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввдите количество чисел в последовательность(от 1 до 100)");
        int quantityOfNumbers = sc.nextInt();
        int[] numbers;
        numbers = new int[quantityOfNumbers];
        for (int i = 0; i < quantityOfNumbers; i++) {
            int number = rand.nextInt(-100,100);
            System.out.println(number);
            numbers[i] = number;
        }
        Arrays.sort(numbers);
        System.out.println("Минимальное число в массиве - " + numbers[0]);
    }
}
