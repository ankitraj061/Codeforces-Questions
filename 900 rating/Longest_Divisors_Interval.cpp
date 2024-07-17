#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        long long n;
        cin >> n;
        if (n % 2 == 1)
        {
            cout << 1 << endl;
        }

        else
        {
            int j=1;
            while(n%j==0){
                j+=1;
            }
            cout<<j-1<<endl;
        }
    }
}