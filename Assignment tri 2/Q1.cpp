#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    int sum = 0, mode;
    float avg;

    vector<float> v[5];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        int *min = min_element(a, a + i + 1);
        int *max = max_element(a, a + i + 1);
        v[0].push_back(*min);
        v[1].push_back(*max);
        sum += a[i];
        v[2].push_back(sum);
        avg = (float)sum / (float)(i + 1);
        v[3].push_back(avg);
        mode = *max_element(a, a + i + 1);
        v[4].push_back(mode);
    }
     
    for (int i = 0; i < n; i++)
    {
        cout <<(int) v[0][i] << " " << (int)v[1][i] << " " <<(int) v[2][i] << " " << v[3][i] << " " <<(int) v[4][i] << endl;
    }
}