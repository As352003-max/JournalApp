#include<stdio.h>

int main(int argc, char const *argv[])
{
    int n;
    printf("\n enter any number between 1-3:");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
    printf("\n 5");
    break;
    
    case 2:
    printf("\n 6");
    break;

    case 3:
    printf("\n 7");
    break;
    }
    return 0;
}
