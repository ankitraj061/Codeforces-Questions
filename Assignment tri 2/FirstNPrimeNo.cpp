#include <bits/stdc++.h>
using namespace std;
bool isPrime(int n)
{
    if (n == 2 || n == 3)
    {
        return true;
    }
    else if (n % 2 == 0 || n % 3 == 0)
    {
        return false;
    }
    else
    {
        for (int i = 5; i * i <= n; i += 6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
        }
    }
    return true;
}

int main()
{
    int n;
    cin >> n;
    int count = 0;
    vector<int> prime;
    int i = 2;
    while (count != n * 2)
    {
        if (isPrime(i))
        {
            prime.push_back(i);
            count++;
            if (count == n * 2)
            {
                break;
            }
        }
        i++;
    }
    for (int i = 0; i < prime.size(); i += 2)
    {
        cout << prime[i] << endl;
    }
    return 0;
}