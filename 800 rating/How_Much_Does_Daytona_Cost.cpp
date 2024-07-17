#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int m;
        cin>>m;
        int arr[n];
        for(int j=0;j<n;j++){
            cin>>arr[j];
        }
        bool flag=false;
        for(int j=0;j<n;j++){
            if(arr[j]==m){
                flag=true;
                break;
            }
        }
        if(flag){
            cout<<"Yes"<<endl;
        }
        else{
            cout<<"No"<<endl;
        }
    }
}