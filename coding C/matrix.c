#include<stdio.h>

int main()
{
    int a[3][3],i,j;
    for(i=0;i<3;i++)
    for(j=0;j<3;j++)
    {
        printf("\n enter the value of 2D arrays:");
        scanf("%d",&a[i][j]);
    }
    printf("\n 2D array element are:");
    for ( i = 0; i < 3; i++)
    {
        printf("\n");
        for(j=0;j<3;j++)
        printf("%d\t",a[i][j]);    
    }
    
    return 0;
}
