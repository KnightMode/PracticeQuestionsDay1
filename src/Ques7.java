public class Ques7 {
    private static int possibilities = 0;
    private static int adventureValue = 0;
    private static int[][] a = provideInputMatrix();

    public static void main(String[] args) {

        findAdventurePath(a);
    }

    private static void findAdventurePath(int[][] a) {
        findPathAndPossibilities(0, 0);
    }

    private static void findPathAndPossibilities(int rowIndex, int columnIndex) {
        if (rowIndex == 4 && columnIndex == 4) {
            possibilities++;
            adventureValue += a[rowIndex][columnIndex];
            System.out.println("The adventure Value for this path is: " + adventureValue + " and the possibilities are: " + possibilities);
            adventureValue = 0;
        } else {
            if (a[rowIndex][columnIndex] == 1) {
                columnIndex++;
                if (columnIndex != 5) {
                    adventureValue += 1;
                    findPathAndPossibilities(rowIndex, columnIndex);
                }
            }
            if (a[rowIndex][columnIndex] == 2) {
                rowIndex++;
                if (rowIndex != 5) {
                    adventureValue += 2;
                    findPathAndPossibilities(rowIndex, columnIndex);
                }
            }
            if (a[rowIndex][columnIndex] == 3) {
                columnIndex++;
                if (columnIndex != 5) {
                    adventureValue += 3;
                    findPathAndPossibilities(rowIndex, columnIndex);
                }

                if (rowIndex != 5) {
                    rowIndex++;
                    adventureValue += 3;
                    findPathAndPossibilities(rowIndex, columnIndex == 5 ? 4 : columnIndex);
                }
            }
        }
    }

    private static int[][] provideInputMatrix() {
        return new int[][]{
                {1, 1, 3, 2, 1},
                {3, 2, 2, 1, 2},
                {1, 3, 3, 1, 3},
                {1, 2, 3, 1, 2},
                {1, 1, 1, 3, 1},
        };
    }
}

