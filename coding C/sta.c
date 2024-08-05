#include<stdio.h>

int main()
{
    int i,j,b;
    i=1;
    while (i<=5)
    {
        printf("\n");
        b=1;
        while (b<=5-i)
        {
            printf("-");
            b++;
    
        }
        j=1;
        
        while (j<=i)
        {
            printf("%d",i);
            j++;
        }
       i++; 
    }
    
    return 0;
}

