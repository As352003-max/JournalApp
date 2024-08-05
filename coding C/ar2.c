#include<stdio.h>

int main()
{
    int a[10],i,sum=0,pro=1;
    for ( i = 0; i < 10; i++)
    {
        printf("\n enter the number:");
        scanf("%d",&a[i]);
    }
    for ( i = 0; i < 10; i++)
    {
        if (a[i]%2==0)
        
            sum=sum+a[i];
            else
            pro=pro*a[i];
        
        
    }
    
printf("\n sum of even=%d and product of odd=%d",sum,pro);
    return 0;
}
