#include <stdio.h>

int main()
{

    FILE *ifp;

    char buf[20];

    ifp = fopen("data.txt", "w+");

    fprintf(ifp, "%s", "Hello world\n");

    rewind(ifp);

    fscanf(ifp, "%s", buf);

    printf("%s", buf);
}