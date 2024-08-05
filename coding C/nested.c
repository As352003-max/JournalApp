#include<stdio.h>

int main()
{
    int i,j;
    printf("\n enter the number");
    scanf("%d",&i);
    i=1;
    while (i<=5)
    {
        j=1;
        while (j<=5)
        {
            printf("%d",j);
            j++;
        }
       i++; 
    }

    return 0;
}
