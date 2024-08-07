#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    int a[n];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    std::sort(a, a + n);

    int sum = 0;
    for (int i = 0; i < m; i++)
    {
        if (a[i] < 0)
        {
            sum += a[i];
        }
    }

    std::cout << abs(sum) << endl;

    return 0;
}
