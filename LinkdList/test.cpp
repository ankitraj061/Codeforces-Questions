#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<pair<int,int>> v;
    v.push_back({10,2});
    v.push_back({3,40});
    v.push_back({5,6});
    v.push_back({7,8});
    //sort by second
    sort(v.begin(),v.end(),[](pair<int,int> a,pair<int,int> b){
        return a.second<b.second;
    });
    for(int i=0;i<v.size();i++){
        cout<<v[i].first<<" "<<v[i].second<<endl;
    }

}