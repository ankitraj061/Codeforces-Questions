#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int a,b;
        cin>>a>>b;
        int kx,ky;
        cin>>kx>>ky;
        int qx,qy;
        cin>>qx>>qy;
        vector<pair<int,int>> k;
        vector<pair<int,int>> q;
        k.push_back({kx+a,ky+b});
        k.push_back({kx+a,ky-b});
        k.push_back({kx-a,ky-b});
        k.push_back({kx-a,ky+b});
        if(a!=b){
            k.push_back({kx+b,ky+a});
            k.push_back({kx+b,ky-a});
            k.push_back({kx-b,ky-a});
            k.push_back({kx-b,ky+a});
        }
        


        q.push_back({qx+a,qy+b});
        q.push_back({qx+a,qy-b});
        q.push_back({qx-a,qy-b});
        q.push_back({qx-a,qy+b});
        if(a!=b){
            q.push_back({qx+b,qy+a});
            q.push_back({qx+b,qy-a});
            q.push_back({qx-b,qy-a});
            q.push_back({qx-b,qy+a});
        }
        
        int count=0;
        for(int j=0;j<k.size();j++){
            for(int l=0;l<q.size();l++){
                if(k[j].first==q[l].first && k[j].second==q[l].second){
                    count++;
                    
                }
            }
        }
        cout<<count<<endl;


    }

}