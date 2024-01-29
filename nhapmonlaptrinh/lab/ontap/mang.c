#include <stdio.h>

int main()
{
    int cac[10];
    for (int i = 0; i < 10; i++)
    {
        printf("Nhap i di nhoc a[%d]", i);
        scanf("%d", &cac[i]);
    }
    printf("Phan tu trong nay: ");
    for (int i = 0; i < 10; i++)
    {
        printf("\t %d", cac[i]);
    }
}