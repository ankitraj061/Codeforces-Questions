#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int arr[n];
        int check=0;
        for(int j=0;j<n;j++){
            cin>>arr[j];
            if(arr[j]==0){
                check+=1;
            }
        }
        if(check==n){
            cout<<0<<endl;
        }
        else{
            int check1=0;
            for(int j=0;j<n;j++){
                if(arr[j]!=0){
                    check1=j;
                    break;
                }
            }
            bool count=false;
            for(int j=check1;j<n-check+check1;j++){
                if(arr[j]==0){
                    count=true;
                    break;
                }
            }
            if(count==true){
                cout<<2<<endl;
            }
            else{
                cout<<1<<endl;
            }
            
        }
        
    }
}