import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số N
        System.out.print("Nhập N (1 <= N <= 9): ");
        int n = sc.nextInt();

        // In bảng cửu chương N
        if (n >= 1 && n <= 9) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        } else {
            System.out.println("N phải nằm trong khoảng 1 đến 9!");
        }

        sc.close();
    }
}
