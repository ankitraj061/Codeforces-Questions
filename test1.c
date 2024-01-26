#include <stdio.h>

int main()
{
    char str[100];
    char searchChar;
    int i, index = -1;

    // Take input string from the user
    printf("Enter the string: ");
    fgets(str, sizeof(str), stdin);

    // Take the character to search from the user
    printf("Enter the character: ");
    scanf(" %c", &searchChar);

    // Iterate through the string to find the character
    for (i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == searchChar)
        {
            index = i;
            break; // Character found, exit the loop
        }
    }

    // Check if the character was found or not
    if (index != -1)
    {
        printf("Index of %c is %d\n", searchChar, index);
    }
    else
    {
        printf("Character %c is not present\n", searchChar);
    }

    return 0;
}