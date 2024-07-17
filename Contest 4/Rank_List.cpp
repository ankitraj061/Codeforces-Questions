#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, k;
    cin >> n >> k;
    pair<int, int> b;
    pair<int, int> a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i].first >> a[i].second;
    }
    cout << endl;
    cout << endl;
    sort(a, a + n, [](const pair<int, int> &x, const pair<int, int> &y)
         {
        if (x.first == y.first) {
            return x.second < y.second;
        }
        return x.first > y.first; });

        for (int i = 0; i < n; i++)
    {
        if (i + 1 == k)
        {
            b.first = a[i].first;
            b.second = a[i].second;
        }
    }

    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i].first == b.first && a[i].second == b.second)
        {
            count++;
        }
    }
    cout << count;
    return 0;
}