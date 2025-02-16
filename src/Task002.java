import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1;
        int y1;
        int x2;
        int y2;
        do {
            System.out.println("Введите координату x для первой клетки: ");
            x1 = sc.nextInt();
        } while (x1 > 8);
        do {
            System.out.println("Введите координату y для первой клетки: ");
            y1 = sc.nextInt();
        } while (y1 > 8);
        do {
            System.out.println("Введите координату x для второй клетки: ");
            x2 = sc.nextInt();
        } while (x2 > 8);
        do {
            System.out.println("Введите координату y для второй клетки: ");
            y2 = sc.nextInt();
        } while (y2 > 8);
        boolean isWhite1;
        boolean isWhite2;
        if (x1 == y1) {
            isWhite1 = true;
        }
        else {
            if ((x1 % 2) != 0 && (y1 % 2) != 0) {
                isWhite1 = true;
            }
            else {
                if ((x1 % 2) == 0 && (y1 % 2) == 0) {
                    isWhite1 = true;
                }
                else {
                    isWhite1 = false;
                }
            }
        }
        if (x2 == y2) {
            isWhite2 = true;
        }
        else {
            if ((x2 % 2) != 0 && (y2 % 2) != 0) {
                isWhite2 = true;
            }
            else {
                if ((x2 % 2) == 0 && (y2 % 2) == 0) {
                    isWhite2 = true;
                }
                else {
                    isWhite2 = false;
                }
            }
        }
        if (isWhite1 == isWhite2) {
            System.out.println("YES");

        }else {
            System.out.println("NO");
        }
    }
}
