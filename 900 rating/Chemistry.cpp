#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    
    for(int i = 0; i < t; i++){
        int n, k;
        cin >> n >> k;
        char arr[n];
        cin >> arr;

        
        unordered_map<char, int> frequencyMap;
        for(int j = 0; j < n; ++j) {
            frequencyMap[arr[j]]++;
        }

        
        vector<pair<char, int>> uniqueCharsAndFreqs;
        for(auto& kv : frequencyMap) {
            uniqueCharsAndFreqs.push_back(kv);
        }

        int count = 0;
        for(int j=0;j<uniqueCharsAndFreqs.size();j++){
           if(uniqueCharsAndFreqs[j].second %2!=0){
               count++;
           }
        }
        if(count-1<=k){
            cout << "YES" << endl;
        }
        else{
            cout << "NO" << endl;
        }
    }
    return 0;
}
