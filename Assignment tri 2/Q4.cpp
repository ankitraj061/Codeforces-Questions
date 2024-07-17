#include <bits/stdc++.h>
using namespace std;
int power(int a, int b, int m)
{
    if (b == 0)
    {
        return 1;
    }
    int temp = power(a, b / 2, m);
    if (b % 2 == 0)
    {
        return (temp * temp) % m;
    }
    else
    {
        return (((temp * temp) % m) * a) % m;
    }
}
int main()
{
    int a, b, m;
    cin >> a >> b >> m;
    int result = power(a, b, m);
    cout << result;
}
