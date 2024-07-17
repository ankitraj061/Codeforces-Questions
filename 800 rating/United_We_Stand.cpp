#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;
        int arr[n];
        for (int j = 0; j < n; j++)
        {
            cin >> arr[j];
        }
        if (n == 1)
        {
            cout << -1 << endl;
        }
        else
        {

            sort(arr, arr + n);
            if (arr[0] == arr[n - 1])
            {
                cout << -1 << endl;
            }
            else
            {

                vector<int> b;
                vector<int> c;
                for (int j = 0; j < n; j++)
                {
                    if(arr[j]!=arr[n-1])
                    {
                        b.push_back(arr[j]);
                    }
                    else
                    {
                        c.push_back(arr[j]);
                    }
                }
                cout<<b.size()<<" "<<c.size()<<endl;
                for(int j=0;j<b.size();j++){
                    cout<<b[j]<<" ";
                }
                cout<<endl;
                for(int j=0;j<c.size();j++){
                    cout<<c[j]<<" ";
                }
            }
        }
    }
}