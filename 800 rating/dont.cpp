#include <iostream>
#include <string>

using namespace std;

int main()
{
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;
        int m;
        cin >> m;
        string x;
        cin >> x;
        string s;
        cin >> s;
        int count = 0;
        bool flag = false;
        
        while (x.length() < 100)
        {
            
            if (x.find(s) != string::npos)
            {
                
                flag = true;
                break;
            }
            else
            {

                x.append(x);
                count++;
            }
        }

        if (flag)
        {
            cout << count << endl;
        }
        else
        {
            cout << -1 << endl;
        }
    }
    return 0;
}