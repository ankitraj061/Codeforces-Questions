#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int score = 0;
        char arr[10][10];

        for (int j = 0; j < 10; j++)
        {
            for (int k = 0; k < 10; k++)
            {
                cin >> arr[j][k];
                if (arr[j][k] == 'X')
                {

                    if (j == 0 || k == 0 || j == 9 || k == 9)
                    {
                        score += 1;
                    }
                    else if ((j == 1 && k != 0 && k != 9) || (k == 1 && j != 0 && j != 9) || (j == 8 && k != 0 && k != 9) || (k == 8 && j != 0 && j != 9))
                    {
                        score += 2;
                    }
                    else if ((j == 2 && k != 0 && k != 9 && k != 1 && k != 8) || (k == 2 && j != 0 && j != 9 && j != 1 && j != 8) || (j == 7 && k != 0 && k != 9 && k != 1 && k != 8) || (k == 7 && j != 0 && j != 9 && j != 1 && j != 8))
                    {
                        score += 3;
                    }
                    else if ((j == 3 && (k >=3 && k<=6)) || (k == 3 && (j >=3 && j<=6)) || (j==6 &&(k>=3 && k<=6)) || (k==6 &&(j>=3 && j<=6)))
                    {
                        score += 4;
                    }
                    else if ((j == 4 && (k == 4 || k == 5)) || (j == 5 && (k == 4 || k == 5)))
                    {
                        score += 5;
                    }
                }
            }
        }
        cout << score << endl;
    }
}