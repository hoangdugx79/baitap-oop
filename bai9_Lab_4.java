import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int giaithua = 1;
        for(int i=1;i<=n;i++){
            giaithua*=i;
        }

        System.out.println(giaithua);
    }

}
