#include <stdio.h>
struct employee
{
    int code;
    char name[50];
    float salary;
};
int main()
{
    struct employee a[10];
    int i, key, flag = 0, pos;
    for (i = 0; i < 10; i++)
    {
        printf("\n enter employee code:");
        scanf("%d", &a[i].code);
        printf("\n enter the employee name:");
        gets(a[i].name);
        printf("\n enter the salary:");
        scanf("%f", &a[i].salary);
    }
    printf("enter employee code to search");
    scanf("%d", &key);
    for (i = 0; i < 10; i++)
    {
        if (a[i].code == key)
        {
            flag = 1;
            pos = i;
            break;
        }
    }
    if (flag == 1)
    {
        printf("\n code=%d", a[pos].code);
        printf("\n name=%s", a[pos].name);
        printf("\n salary=%f", a[pos].salary);
    }
    else
        printf("the search value not found");
    return 0;
}
