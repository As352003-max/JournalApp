#include<stdio.h>

int main()
{
    int n,i=1;
    printf("\n enter number:");
    scanf("%d",&n);
    printnum:
    printf("\n%d",i);
    i++;
    if(i<=n)
    goto printnum;
    return 0;
}
