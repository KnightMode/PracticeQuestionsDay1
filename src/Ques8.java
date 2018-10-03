import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        int possibleComb = 0, tempProd, k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        List<Integer> integerList = new ArrayList<>();
        generateNumbers(integerList);

        for (int i = 0; i < integerList.size(); i++) {
            tempProd = 1;
            for (int j = i; j < integerList.size(); j++) {
                tempProd *= integerList.get(j);
                if (tempProd < k)
                    possibleComb++;
                else break;
            }
        }
        System.out.println(possibleComb);
    }

    private static void generateNumbers(List<Integer> integerList) {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
    }
}
