import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        for (int i = 1; i <= n; m++)
            i = i + m;
        System.out.println(m - 1);
    }
}
