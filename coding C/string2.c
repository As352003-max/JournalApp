#include<stdio.h>

int main(int argc, char const *argv[])
{
    char a[100];
    int i,word=1;
    printf("\n enter  your name:");
    gets(a);
    i=0;
    while (a[i]!='\0')
    {
        if (a[i]==' ')
        {
            word++;
        }
        i++;
    }
    printf("\n number of words=%d",word);

    return 0;
}
