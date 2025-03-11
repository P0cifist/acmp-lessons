import java.util.Scanner;

public class Task024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String number = sc.nextLine();
        String[] numbers = number.split(" ");
        int[] numberArray = new int[numbers.length];
        System.out.println(numberArray.length);
        for (int i = 0; i < numbers.length; i++) {
                numberArray[i] = Integer.parseInt(numbers[i]);
                System.out.print(numberArray[i] + " ");
        }
    }
}
