#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int arr[n-1];
        int sum=0;
        for(int j=0;j<n-1;j++){
            cin>>arr[j];
            sum+=arr[j];
        }
        cout<<-1*sum<<endl;
    }
}