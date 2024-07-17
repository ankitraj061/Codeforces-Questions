#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n,k;
        cin>>n>>k;
        int arr[n];
        for(int j=0;j<n;j++){
            cin>>arr[j];
        }
        sort(arr,arr+n);
        int count=1;
        int check=arr[0];
        int maxcount=0;
        for(int j=1;j<n;j++){
            if(arr[j]-check<=k){
                count++;
                check=arr[j];
            }
            else{
                maxcount=max(maxcount,count);
                count=1;
                check=arr[j];
            }
        }
        maxcount=max(maxcount,count);
        cout<<n-maxcount<<endl;

    }
}