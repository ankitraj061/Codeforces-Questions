#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    for (int i = 0; i < t; i++) {
        int n;
        cin >> n;
        
        char arr[n];
        int count = 0;
        int ans = 0;
        for(int j=0;j<n;j++){
            cin >> arr[j];
        }
        
        for(int j=0;j<n;j++){
            if (arr[j] == '.') {
                count++;
                if(count>2){
                    break;
                }
            }
            
            else {
                
                ans+=count;
                count = 0;
            }
        }
        ans+=count;
        if (count>2) {
           cout << "2" << endl;
        } else {    
            cout<<ans<<endl;
        }
    }

    return 0;
}
