#include <stdio.h>
int main()
{
    int a,b,c;
    printf("\nenter three number");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b&&a>c)
    printf("\nmax no=%d",a);
    else if(b>a&&b>c)
    printf("\nmax no=%d",b);
    else
    printf("\nmax no=%d",c);

    return 0;
}    

