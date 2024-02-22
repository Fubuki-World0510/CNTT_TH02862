#include <stdio.h>
//SẮP XẾP TỪ LỚN ĐẾN BÉ
int main()
{
    int n, i;
    printf("N fr di cu:");
    scanf("%d", &n);
    int a[n];
    for (i = 0; i < n; i++)
    {
        printf("a[%d]=", i);
        scanf("%d", &a[i]);
    }
    printf("Luc dau: ");
    for (i = 0; i < n; i++)
    {
        printf("\t %d", a[i]);
    } //Lay so ban dau
    int j;
    int b;
    //Sap xep
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (a[i] > a[j])
            {
                b = a[i];
                a[i] = a[j];
                a[j] = b;
            }
        }
    }
    printf("\nLuc sau:");
    //Lay so sau khi sap xep
    for (i = 0; i < n; i++)
    {
        printf("\t%d", a[i]);
    }
    return 0;
}