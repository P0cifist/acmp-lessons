import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean numberIsRight = false;
        int isThisNumberDegreeOfTwo = sc.nextInt();
        int x = 2;
        int[] degreeOfTwo = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                x = x * 2;
            }
            degreeOfTwo[i] = x;
            System.out.println(degreeOfTwo[i]);
            x = 2;
        }
        for (int i = 0; i < 10; i++) {
            if (degreeOfTwo[i] == isThisNumberDegreeOfTwo) {
                numberIsRight = true;
                break;
            }
            else {
                numberIsRight = false;
            }
        }
        if (numberIsRight){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
