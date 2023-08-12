import java.util.*;

class TwoD_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("enter number of columns");
        int cols = sc.nextInt();

        int[][] number = new int[rows][cols];
        System.out.println("enter the matrix: ");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                number[i][j] = sc.nextInt();

            }
        }
        System.out.println("enter x: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (number[i][j] == x) {

                    System.out.println("the number found at the location (" + i + "," + j + ")");
                }
            }
        }

    }
}