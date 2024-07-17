#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    int s, n;
    cin >> s >> n;
    pair<int, int> a[1000];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i].first >> a[i].second;
    }
    sort(a, a + n);
    for (int i = 0; i < n; i++)
    {
        if (a[i].first < s)
        {
            s += a[i].second;
        }
        else
        {
            cout << "NO";
            return 0;
        }
    }
    cout << "YES";
    return 0;
}