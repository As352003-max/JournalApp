#include<stdio.h>

int main(int argc, char const *argv[])
{
    char a[50],b[50],c[50];
    int i,j;
    printf("\n enter first string:");
    gets(a);
    printf("\n enter second string:");
    gets(b);
    i=j=0;
    while (a[i]!='\0')
    {
        c[i]=a[i];
        i++;
    }
    while (b[j]!='\0')
    {
        c[i]=b[j];
        i++;j++;
    }
    c[i]='\0';
    printf("\n concatenation string=%s",c);
    
    return 0;
}
