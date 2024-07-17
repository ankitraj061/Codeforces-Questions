#include<bits/stdc++.h>
using namespace std;
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
        int diff=arr[0];
        for(int j=0;j<n-1;j++){
            if(arr[j+1]-arr[j]>diff){
                diff=arr[j+1]-arr[j];
                
            }
        }
        if(k>arr[n-1]&&2*(k-arr[n-1])>diff){
            diff=2*(k-arr[n-1]);
        }
        cout<<diff<<endl;
    }
    return 0;
}