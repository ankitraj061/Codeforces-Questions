import java.util.Scanner;

class arrayFindSubarrays {
    public static void subArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(a[k] + " ");

                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + "th index value :");
            arr[i] = sc.nextInt();
        }
        subArray(arr);
    }
}