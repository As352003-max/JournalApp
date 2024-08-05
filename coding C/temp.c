#include <stdio.h>

int main(int argc, char const *argv[])
{
    float c,f;
    printf("enter temprature in celsius:\n");
    scanf("%f",&c);
    f=(c*9/5)+32;
    printf("temp in fah=%f",f);

    return 0;
}
