#include<stdio.h>

int main()
{
    int a[3][3], i, j;
    printf("\n enter value for the matrix:");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("\n enter the value of 2d array:");
            scanf("%d", &a[i][j]);
        }
    }
    printf("\n the original matrix is:");
    for (i = 0; i < 3; i++)
    {
        printf("\n");
        for (j = 0; j < 3; j++)
        {
            printf("%d \t", a[i][j]);
        }
    }
    printf("\n transpose of the matrix:");
    for (i = 0; i < 3; i++)
    {
        printf("\n");
        for (j = 0; j < 3; j++)
        {
            printf("%d \t", a[j][i]);
        }
    }

    return 0;
}
