#include<stdio.h>

int main()
{
    int i,x,sum=0;
    printf("\n enter no to check:");
    scanf("%d",&i);
    x=i;
    while (i>0)
    {
        sum=sum+(i%10)*(i%10)*(i%10);
        i=i/10;
    }
    if (sum==x)
    printf("\n armstrong number");
    else
    printf("\n not armstrong");

    return 0;
}
