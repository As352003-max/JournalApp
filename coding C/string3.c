#include <stdio.h>

int main(int argc, char const *argv[])
{
    char a[100];
    int i, vol = 0, cons = 0;
    printf("\n enter your name:");
    gets(a);
    i = 0;
    
    while (a[i] != '\0')
    {
        if (a[i] >= 67 && a[i] <= 90 || a[i] >= 97 && a[i] <= 122)
    
    {
        if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'U')
       {
            vol++;
       }
        else
            cons++;
    }
        i++;
    
    }
    printf("total no of vowels=%d and total consonant=%d" , vol, cons);
    return 0;

}