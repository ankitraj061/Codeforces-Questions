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
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += a[i];
    }
    sort(a, a + n);
    int sum1 = 0;
    int count = 0;
    for (int i = n - 1; i >= 0; i--)
    {
        sum1 += a[i];
        count++;
        if (sum1 > sum - sum1)
        {
            break;
        }
    }
    cout << count;

    return 0;
}