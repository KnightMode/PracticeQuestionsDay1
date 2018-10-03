import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N: ");
        int n = sc.nextInt();
        System.out.println("The combinations are: ");
        for (int a = 0; a < n; a++) {
            if (a % 3 != 0 || a == 0) {
                for (int b = 0; b < n; b++) {
                    if (b % 3 != 0 || b == 0) {
                        for (int c = 0; c < n; c++) {
                            if (c % 3 != 0 || c == 0) {
                                if ((a + b + c == n)) {
                                    System.out.println(a + " " + b + " " + c);
                                } else {
                                    System.out.print("");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
