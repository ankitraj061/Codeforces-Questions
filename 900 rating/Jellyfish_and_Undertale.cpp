#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        long long a, b, n;
        cin >> a >> b >> n;
        vector<int> v;

        for (int i = 0; i < n; ++i)
        {
            int num;
            cin >> num;
            if (b + num > a)
            {
                num = a;
            }
            auto it = upper_bound(v.begin(), v.end(), num);
            v.insert(it, num);
        }
        for (int j = 0; j < v.size() - 1; ++j)
        {
            if (v[j] == v[j + 1])
            {
                v[j] += v[j + 1];
                v.erase(v.begin() + j + 1);
                --j;
            }
        }
        for (int j = 0; j < v.size(); ++j)
        {
            if (v[j] + b > a && j <= v.size() - 2)
            {
                v[j] = a-1;
            }
            else if (v[j] + b > a && j == v.size()-1)
            {
                v[j]=a;
            }
            else if(j <= v.size() - 2)
            {
                v[j] = v[j] + b-1;
            }
            else{
                v[j] = v[j] + b;
            }
        }
        long long sum=0;
        for (int num : v)
        {
            sum+=num;
        }

        cout<<sum << endl;
    }
}