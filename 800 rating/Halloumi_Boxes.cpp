#include<bits/stdc++.h>
using namespace std;
bool isSorted(int arr[],int n){
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            return false;
        }
    }
    return true;
}

int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int n,k;
        cin>>n>>k;
        int arr[n];
        for(int j=0;j<n;j++)
        {
            cin>>arr[j];
        }
        if((k==1 &&n==1)||k!=1||  isSorted(arr,n))
        {
            cout<<"Yes"<<endl;
        }
        else
        {
            cout<<"No"<<endl;
        }
        
    }
    return 0;
}