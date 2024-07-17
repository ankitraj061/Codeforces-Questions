#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n,q;
        cin>>n>>q;
        int arr[n];
        int sum=0;
        vector<long long> v;
        for(int j=0;j<n;j++){
            cin>>arr[j];
            sum+=arr[j];
            v.push_back(sum);

        }
        for(int j=0;j<q;j++){
            int l,r,k;
            cin>>l>>r>>k;
            int change =(r-l+1)*k;
            if(l>=2){
                t=v[l-2];
                
            }
            else{
                t=0;
            }
            if((sum+change-v[r-1]+t )%2!=0){
                cout<<"YES"<<endl;
            }
            else{
                cout<<"NO"<<endl;

            }

        }
        

    }
    return 0;
}