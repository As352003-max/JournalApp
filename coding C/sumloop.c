#include<stdio.h>

int main()
{
    int n,i,sum;
    printf("\n enter value of n:");
    scanf("%d",&n);
    i=1;
    sum=0;
    while (i<=n)
    {
      sum=sum+i;
      i=i+1;

    }
    printf("\n sum=%d",sum);

    return 0;
}
