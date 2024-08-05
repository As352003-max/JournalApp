#include <stdio.h>

int main()
{
    int a[3][3], b[3][3], i, j, c[3][3];
    printf("\n enter the value of matrix:");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("\n enter the value of 2D arrays:");
            scanf("%d", &a[i][j]);
        }
    }
    printf("\n enter the value of 2 matrix:");
    for (i = 0; i < 3; i++)
    {
         
        for (j = 0; j < 3; j++)
        {
            printf("\n enter the value of 2D arrays:");
            scanf("%d", &b[i][j]);
        }
    }
    printf("\n first matrix is:");
    for (i = 0; i < 3; i++)
    {
        printf("\n");

        for (j = 0; j < 3; j++)

            printf("%d\t", a[i][j]);
    }
    printf("\n second matrix is:");
    for (i = 0; i < 3; i++)
    {
        printf("\n");

        for (j = 0; j < 3; j++)

            printf("%d\t", b[i][j]);
    }
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            c[i][j] = a[i][j] + b[i][j];
        }
    }
    printf("\n addition of matrix is:");

    for (i = 0; i < 3; i++)
    {
        printf("\n");
        for (j = 0; j < 3; j++)
        {
            printf("%d \t", c[i][j]);
        }
    }
    return 0;
}