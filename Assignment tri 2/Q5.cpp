#include <bits/stdc++.h>
using namespace std;
bool binarySearch(int a[], int l, int r, int x)
{
    while (l <= r)
    {
        int mid = (l + r) / 2;
        if (a[mid] == x)
        {
            return true;
        }
        else if (a[mid] < x)
        {
            l = mid + 1;
        }
        else
            r = mid - 1;
    }
    return false;
}
int lowerBound(int a[], int low, int high, int x)
{
    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        if (mid == 0 && a[mid] == x)
        {
            return 0;
        }
        else if (a[mid] == x && a[mid - 1] < x)
        {
            return mid;
        }
        else if (a[mid] <x)
        {
            low = mid + 1;
        }
        else
            high = mid - 1;
    }
}
int higherBound(int a[], int low, int high, int x)
{
    int n = high;
    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        if (mid == n - 1 && a[mid] == x)
        {
            return n - 1;
        }
        else if (a[mid] == x && a[mid + 1] > x)
        {
            return mid;
        }
        else if (a[mid] <= x)
        {
            low = mid + 1;
        }
        else
            high = mid - 1;
    }
}
int main()
{
    int a[] = {1, 2, 3, 3, 3, 4, 5};
    int n = sizeof(a) / sizeof(a[0]);
    bool result = binarySearch(a, 0, n, 3);

    if (result == true)
    {
        cout << "True" << endl;
        int lowerBon = lowerBound(a, 0, n - 1, 3);
        int higherBon = higherBound(a, 0, n - 1, 3);
        cout << lowerBon << endl;
        cout << higherBon << endl;
    }
    else
        cout << "False";
}