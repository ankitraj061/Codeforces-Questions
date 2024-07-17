#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n, k;
        cin >> n >> k ;
        long long x;
        cin >> x;
        long long max = 0;  
        long long min = 0;  
        min = (long long)k * (k + 1) / 2;
       max = (long long)n * (n + 1) / 2 - (long long)(n - k) * (n - k + 1) / 2;
        if (min <= x && x <= max) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;  
}
