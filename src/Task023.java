import java.util.Random;
import java.util.Scanner;

public class Task023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = sc.nextInt();
        double[] revenue = new double[n];
        double[] tax = new double[n];
        double maxTax = 0;
        int numberOfCorp = 0;
        for (int i = 0; i < n; i++) {
            revenue[i] = rand.nextInt(155);
            tax[i] = rand.nextInt(101);
        }
        for (int i = 0; i < revenue.length; i++) {
            double currentTax = (revenue[i] * tax[i]) / 100;
            if (currentTax > maxTax) {
                maxTax = currentTax;
                numberOfCorp = i + 1;
            }
        }
        System.out.println(numberOfCorp);
    }
}
