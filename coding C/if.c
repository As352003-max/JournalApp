#include <stdio.h>
int main()
{
    int age;
    printf("\n enter age:");
    scanf("%d",&age);
    if(age>=18)
    printf("\n eligible for voting");
    else
    printf("\n not eligible for voting");
    return 0;
}
