#include <stdio.h>
int main(int argc, char const *argv[])
{
    int marks[5],t;
    for (int i = 0; i < 5; i++)
    {
        printf("Enter the element of an array:\n");
        scanf("%d",&marks[i]);
    }
    
   for (int i = 0; i < 4; i++)
   {
    for (int j = i+1; j < 5; j++)
    {    if (marks[i]>marks[j])
    {
        t=marks[i];
        marks[i]=marks[j];
        marks[j]=t;
    }       
    }   
   }
   printf("Array after sorting is\n");
   for (int i = 0; i < 5; i++)
   {
    printf("%d\n",marks[i]);
   }
   
   return 0;
}

