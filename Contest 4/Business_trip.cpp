#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int k, a[12];
    cin >> k;
    int total;
    for (size_t i = 0; i < 12; ++i)
    {
        cin >> a[i];
        total += a[i];
    }

    if (total < k)
    {
        cout << -1 << endl;
    }
    else if (k == 0)
    {
        cout << 0 << endl;
    }
    else
    {
        sort(a, a + 12);
        int sum = 0;
        int count = 0;
        for (int i = 11; i >= 0; i--)
        {
            sum += a[i];
            count++;
            if (sum >= k)
            {
                break;
            }
        }
        cout << count << endl;
    }

    return 0;
}