import java.util.Scanner;

class ArrayEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of responses:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count = 1;
                break;

            }
        }
        if (count == 1) {
            System.out.println("Hard");
        } else {
            System.out.println("Easy");
        }
    }
}