#include<stdio.h>

int main()
{
    int n,fac=1;
    printf("\n enter number:");
    scanf("%d",&n);
    for ( ;n > 0; n--)
    {
        fac=fac*n;
    }
    printf("\n factorial=%d",fac);
    
    return 0;
}
