#include <stdio.h>

int main()
{
    int a[3][3], i, j, sum = 0;
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("\n enter the value of 2D arrays:");
            scanf("%d", &a[i][j]);
        }
    }
    printf("\n 2D array element are:");
    for (i = 0; i < 3; i++)
    {
        printf("\n");

        for (j = 0; j < 3; j++)

            printf("%d\t", a[i][j]);
    }

    for (i = 0; i < 3; i++)
    {
        sum = 0;
        for (j = 0; j < 3; j++)
        {

            sum = sum + a[i][j];
        }
        printf("\n sum of row %d is %d", i + 1, sum);
    }
    for (i = 0; i < 3; i++)
    {
        sum = 0;
        for (j = 0; j < 3; j++)
        {

            sum = sum + a[j][i];
        }
        printf("\n sum of column %d is %d", j + 1, sum);
    }
    return 0;
}
