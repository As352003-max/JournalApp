#include<stdio.h>

int main()
{
    int i,x,rev=0;
    printf("\n enter no to check:");
    scanf("%d",&i);
    x=i;
    while (i>0)
    {
        rev=(rev*10)+i%10;
        i=i/10;
    }
    if(rev==x)
    printf("\n no is palindrome");
    else
    printf("\n no is not palindrome");
    
    return 0;
}
