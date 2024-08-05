#include<stdio.h>

int main(int argc, char const *argv[])
{
    int n,i,b,j;
    printf("\n enter no of rows");
    scanf("%d",&n);
    i=1;
    while (i<=n)
    {
       printf("\n");
       b=1;
       while (b<=n-i)
       {
        printf(" ");
        b++;
       }
       j=1;
       while (j<=i*2-1)
       {
        printf("*");
        j++;
       }
       i=i+1;
        
    }
    
    return 0;
}
