#include<stdio.h>

int main()
{
    int a[10],i;
    for ( i = 0; i < 10; i++)
    {
        printf("\n enter number:");
        scanf("%d",&a[i]);
    }
    printf("\n array element are:");
    for ( i = 0; i < 10; i++)
    printf("\n %d",a[i]);
     
     return 0;
}
