import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int rowNum = 0, colNum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    rowNum = i;
                    colNum = j;
                }

            }
        }
        
        

        int result = Math.abs(rowNum - 2) + Math.abs(colNum - 2);
        System.out.println(result);

    }

}
