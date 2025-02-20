public class Task008 {
    public static void main(String[] args) {
        int hundreds;
        int tens;
        int units;
        for (int i = 100; i <= 999; i++) {
            do{
                hundreds = i / 100;
                tens = i / 10  % 10;
                units = i % 10;
                if (hundreds != tens && hundreds != units && tens != units) {
                    System.out.println(i);
                }
                hundreds = 0;
                tens = 0;
                units = 0;
            } while (hundreds != 0 && tens != 0 && units != 0);
        }
    }
}
