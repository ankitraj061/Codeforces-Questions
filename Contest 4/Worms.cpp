#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        sum += a[i];
        a[i] = sum;
    }
    int m;
    cin >> m;
    int b[m];
    for (int i = 0; i < m; i++)
    {
        cin >> b[i];
    }
    int low = 0;
    int high = n - 1;
    int mid;
    int i = 0;
    while (low <= high)
    {
        if (i == m)
        {
            break;
        }
        mid = (low + high) / 2;
        if (b[i] < a[0])
        {
            cout << 1 << endl;
            i++;
        }
        else if (b[i] > a[n - 2])
        {
            cout << n << endl;
            i++;
        }
        else if (b[i] > a[mid - 1] && b[i] < a[mid + 1])
        {
            cout << mid + 1 << endl;
            i++;
        }
        else if (b[i] < a[mid])
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    return 0;
}