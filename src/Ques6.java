import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of Perimeter: ");
        int perimeter = sc.nextInt();
        for (int a = 1; a < perimeter; a++) {
            for (int b = 1; b < perimeter; b++) {
                int c = perimeter - (a + b) < 0 ? 0 : perimeter - (a + b);
                if (!map.containsKey(c)) {
                    if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) % c == 0) {
                        map.put(c, a + b);
                        System.out.println(a + " " + b + " " + c);
                        break;
                    }
                }
            }
        }
    }
}
