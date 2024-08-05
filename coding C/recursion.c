#include<stdio.h>
int factorial(int);
int main(int argc, char const *argv[])
{
    int n,answer;
    printf("\n enter number:");
    scanf("%d",&n);
    answer=factorial(n);
    printf("factorial=%d",answer);
    return 0;
}
int factorial(int n)
{
int f;
if(n==0)
return 1;
else
f=n*factorial(n-1);
return f;
}
