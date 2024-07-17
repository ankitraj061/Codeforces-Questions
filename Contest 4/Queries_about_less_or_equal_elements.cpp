#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    int a[n];
    int b[m];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i < m; i++)
    {
        cin >> b[i];
    }
    sort(a, a + n);
    int c[m];
    for (int i = 0; i < m; i++)
    {
        c[i] = upper_bound(a, a + n, b[i]) - a;
    }
    for (int i = 0; i < m; i++)
    {
        cout << c[i];
        if (i != m - 1)
        {
            cout << " ";
        }
    }

    return 0;
}