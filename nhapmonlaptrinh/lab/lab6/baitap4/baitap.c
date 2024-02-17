#include <stdio.h>

int main()
{
    int n, m, i, j;

    printf("Nhap so hang: ");
    scanf("%d", &n);
    printf("Nhap so cot: ");
    scanf("%d", &m);

    int a[n][m];

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            printf("a[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }
    }

    printf("\nMang 2 chieu sau khi binh phuong:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            printf("\t %d", a[i][j] * a[i][j]);
        }
        printf("\n");
    }
    return 0;
}
