import java.util.*;

 class C_Yet_Another_Broke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        sc.nextLine();
        long count=0;
        char arr[]=new char[k];x
        int arr1[]=new int[n];
        for(int i=0;i<k;i++){
            arr[i]=sc.next().charAt(0);
            
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(s.charAt(i)==arr[j]){
                    arr1[i]=1;
                }
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            if(arr1[i]==1){
                count++;
            }
            else{
                ans+=count*(count+1)/2;
                count=0;

            }
        }
        System.out.println(ans+count*(count+1)/2);

    }
}