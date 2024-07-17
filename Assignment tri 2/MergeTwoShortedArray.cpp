#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a[] = {1, 3, 5, 7};
    int b[] = {0, 2, 6, 8, 9};
    int n = sizeof(a) / sizeof(a[0]);
    int m = sizeof(b) / sizeof(b[0]);
    int c[n + m];
    int i = 0, j = 0, k = 0;
    while (i < n || j < m)
    {

        if (i  == n)
        {
            c[k++] = b[j++];
        }
        else if (j  == m)
        {
            c[k++] = a[i++];
        }
        else if (a[i] < b[j])
        {
            c[k++] = a[i++];
        }
        else
        {
            c[k++] = b[j++];
        }
    }
    for (int i = 0; i < n + m; i++)
    {
        cout << c[i] << " ";
    }
}