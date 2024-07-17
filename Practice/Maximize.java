import java.util.Scanner;

class Maximize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int check;
            int check1=0;
            int a=x;
            int b=0;
            int res=0;
            for(int j=1;j<x;j++){
                b=j;
                while(a!=0 && b!=0){
                    if(a>b){
                        a=a%b;
                    }
                    else{
                        b=b%a;
                    }
                }
                if(a==0){
                    check=b;
                    if(check+j>check1){
                        check1=check+j;
                        res=j;
                    }
                }
                else{
                    check=a;
                    if(check+j>check1){
                        check1=check+j; 
                        res=j;
                    }
                }
            }
            System.out.println(res);

        }
    }
}