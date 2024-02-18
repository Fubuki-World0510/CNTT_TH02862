#include <stdio.h>

int main()
{
    int n;
    printf("Nhap n di nhoc");
    scanf("%d", &n);
    int a[n], i, getTong;
    int im = 0;
    int tong = 0;

    for (int i = 0; i < n; i++)
    {
        printf("Nhap a[%d]", i);
        scanf("%d", &a[i]);
    }
    printf("Cac so chia het cho 3 la: \n");
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 3 == 0)
        {
            im++;
            tong = tong + a[i];
            printf("\t %d", a[i]);
        }
    }
    printf("\nTrung binh cac so do la %2.f", (float)tong / im);
}