#include <stdio.h>

int main()
{
    int a[3][3], b[3][3], i, j, flag = 0;
    printf("\n enter the value of matrix:");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("\n enter the value of 2D arrays:");
            scanf("%d", &a[i][j]);
        }
    }
     printf("\n first matrix is:");
    for (i = 0; i < 3; i++)
    {
        printf("\n");

        for (j = 0; j < 3; j++)

            printf("%d\t", a[i][j]);
    }
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            if ((j>i)&&(a[i][j]!=0))
            {
                flag = 1;
            }
        }
    }
    if (flag == 1)

        printf("\n not lower triangular matrix");
    else
        printf("\n lower triangular matrix");
}