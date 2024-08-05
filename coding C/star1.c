#include<stdio.h>

int main()
{
    int n,i,x=1;
    printf("\n enter no of rows:");
    scanf("%d",&n);
    while (n>0)
    {
       printf("\n");
       i=1;
       while (i<=n)
       {
          printf("%d",i);
          i++;
       }
       n=n-1;
    }
    
    return 0;
}
