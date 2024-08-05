#include<stdio.h>

int main(int argc, char const *argv[])
{
    int n,i,j,b;
    printf("\n enter number of rows:");
    scanf("%d",&n);
    i=1;
    while (i<=n)
    {
        printf("\n");
        b=1;
        while (b<i)
        {
            printf("-");
            b++;
        }
        j=1;
        while (j<n+1-i)
        {
            printf("*");
            j++;

        }
        i=i+1;
    }
    
    return 0;
}
