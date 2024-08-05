#include<stdio.h>

int main()
{
    int i,a[10],even=0,odd=0;
    for ( i = 0; i < 10; i++)
    {
        printf("\n enter number:");
        scanf("%d",&a[i]);
    }
    for ( i = 0; i < 10; i++)
    {
        if (a[i]%2==0)
         even++;
         else
         odd++;
        
     }
    printf("\n total even =%d and total odd=%d",even,odd);
    
    return 0;
}
