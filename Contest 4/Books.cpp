#include <bits/stdc++.h>
using namespace std;
int main(){
    int n,t;
    cin>>n>>t;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    int c=0;
    for(int i=0;i<n;i++){
        if(t>=a[i]){
            t-=a[i];
            c++;

        }
        else{
            break;
        }
    }
    cout<<c;
    return 0;

}