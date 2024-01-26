
#include <stdio.h>

int main()
{

    int n;

    char arr[100000] = {'a', 'b', 'c', 'd'};

    scanf("%d", &n);

    int i = 0;

    while (n--)
    {

        if (i >= 4)
        {

            i = i % 4;
        }

        printf("%c", arr[i]);

        i++;
    }

    return 0;
}