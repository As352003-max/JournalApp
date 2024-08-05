#include<stdio.h>
#include<string.h>

int main(int argc, char const *argv[])
{
    char str[50];
    printf("\n enter string:");
    gets(str);
    printf("length of string is %d",strlen(str));
    return 0;
}
