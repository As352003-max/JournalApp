#include <stdio.h>

int main()
{
    int a,b,c,max;
    printf("enter three number\n");
    scanf("%d%d%d",&a,&b,&c);
    max=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
    printf("max number=%d\n",max);

    return 0;
}
