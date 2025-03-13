import java.util.Scanner;

public class Task025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность чисел (окончание - 0):");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] numberArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numberArray[i] = Integer.parseInt(numbers[i]);
        }

        String result = "";
        int counter = 0;
        int i = 0;

        while (i < numberArray.length) {
            int numDigits = numberArray[i];
            if (numDigits == 0) {
                break;
            }
            i++;

            String number = "";
            for (int j = 0; j < numDigits; j++) {
                number += numberArray[i];
                i++;
            }


            result += number + " ";
            counter++;
        }

        // Вывод результата
        System.out.println(counter + " " + result.trim());
    }
}