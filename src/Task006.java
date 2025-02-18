import java.util.Scanner;

public class Task006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int previousNumber = 0;
        int lastNumber = 0;
        int counter = 0;
        boolean numberIsNotSame = true;
        do {
            counter++;
            System.out.print("Введите число от -1000 до 1000 - ");
            System.out.println();
            lastNumber = sc.nextInt();
            if (lastNumber == previousNumber) {
                numberIsNotSame = false;
                System.out.print("Последние два числа были равны. Количество введенных чисел - " + counter);
            }
            previousNumber = lastNumber;
            int[] numbersArray;
        } while (numberIsNotSame);
    }
}
