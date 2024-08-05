#include<stdio.h>

int main()
{
    int n,i;
    printf("\n enter value of n:");
    scanf("%d",&n);
    i=1;
    while(i<=10)
    {
        if(i%2!=0)
        printf("\n %d",i);
        i=i+1;
    }
    

    return 0;
}
