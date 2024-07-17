#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        char arr[n];
        for(int j=0;j<n;j++){
            cin>>arr[j];
        }
        int check=arr[0];
        int count=0;
        int maxcount=0;
        for(int j=0;j<n;j++){
            if(arr[j]==check){
                count++;
            }
            else{
                maxcount=max(maxcount,count);
                count=1;
                check=arr[j];
                
            }
            
        }
        maxcount=max(maxcount,count);
        cout<<maxcount+1<<endl;

    }
}