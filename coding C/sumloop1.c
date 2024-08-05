#include<stdio.h>

int main()
{
    int i,sum=0;
    printf("\n enter number:");
    scanf("%d",&i);
    while (i>0)
    {
        sum=sum+i%10;
        i=i/10;
    }
    printf("\n sum of digit=%d",sum);

    return 0;
}
