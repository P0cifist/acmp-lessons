import java.util.Scanner;

public class Task009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5000");
        int a = sc.nextInt();
        int maxNumber = 0;
        int counter = 0;
        int newCounter = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    newCounter++;
                }
            }
            if (counter < newCounter ) {
                counter = newCounter;
                maxNumber = i;
            }
            newCounter = 0;
        }
        System.out.println(maxNumber);
    }
}