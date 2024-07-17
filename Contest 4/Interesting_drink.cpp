#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int q;
    cin >> q;
    int b[q];
    for (int i = 0; i < q; i++)
    {
        cin >> b[i];
    }
    sort(a, a + n);
    int c[q];
    for (int i = 0; i < q; i++)
    {
        c[i] = upper_bound(a, a + n, b[i]) - a;
    }
    for (int i = 0; i < q; i++)
    {
        cout << c[i]<<endl;
        
    }

    return 0;
}