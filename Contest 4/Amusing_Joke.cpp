
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string str;
    cin>>str;
    string str2;
    cin>>str2;
    string str3;
    cin>>str3;
    string str4=str+str2;
    sort(str4.begin(), str4.end());
    
    sort(str3.begin(), str3.end());
    if(str4==str3)
        cout<<"YES";
    else
        cout<<"NO";

    return 0;
}