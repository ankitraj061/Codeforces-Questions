#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int a[n];
        for(int j=0;j<n;j++){
            cin>>a[j];
        }
        int smallest = a[0];
        int largest = a[0];
        int largestIndex = 0;
        for(int j=1;j<n;j++){
            if(a[j]<smallest){
                smallest = a[j];
            }
            if(a[j]>largest){
                largest = a[j];
                largestIndex = j;
            }
        }
        if(a[0]==smallest || a[n-1]==largest || (a[largestIndex]==largest &&a[largestIndex+1]==smallest)){
            cout<<largest-smallest<<endl;
        }
        else if(a[largestIndex]==largest && a[0]>a[largestIndex+1]){
            cout<<largest - a[largestIndex+1]<<endl;
        }
        else{
            cout<<largest-a[0]<<endl;
        }
    }
}