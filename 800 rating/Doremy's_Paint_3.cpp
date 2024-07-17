#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int arr[n];
        for(int j=0;j<n;j++){
            cin>>arr[j];
        }
        if(n==2){
            cout<<"yes"<<endl;
        }
        else if(n==3){
            if(arr[0]==arr[1] || arr[1]==arr[2]|| arr[0]==arr[2]){
                cout<<"yes"<<endl;
            }
            else{
                cout<<"no"<<endl;
            }
             
        }
        else{
            sort(arr,arr+n);
            if(arr[0]==arr[n-1]){
                cout<<"Yes"<<endl;
            }
            else if(n%2==0 && arr[n/2]==arr[n-1] && arr[n/2-1]==arr[0]){
                cout<<"Yes"<<endl;
            }
            else if(n%2==1 && arr[n/2]==arr[0]&&arr[n/2+1]==arr[n-1]){
                cout<<"Yes"<<endl;
            }
            else if(n%2==1 && arr[n/2-1]==arr[0]&&arr[n/2]==arr[n-1]){
                cout<<"Yes"<<endl;
            }
            else{
                cout<<"No"<<endl;
                
            }
        }
    }
}