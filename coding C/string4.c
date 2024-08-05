#include<stdio.h>

int main(int argc, char const *argv[])
{
    char a[50],b[50];
    int i;
    i=0;
    printf("\n enter first string:");
    gets(a);
    while (a[i]!='\0')
    {
        b[i]=a[i];
        i++;

    }
    b[i]='\0';
    printf("\n copied string=%s",b);
    return 0;
}
