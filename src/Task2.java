import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 1;


        for (int i = 0; i < a; i++) {
            if (a < 10) {
                System.out.println(count);
                return;
            }
            a = a / 10;
            count++;
        }
        System.out.println(count);
    }
}
