#include <stdio.h>
// TÌM MIN / MAX
int main()
{
    int n;
    int max, min;
    printf("Nhap so Array: ");
    scanf("%d", &n);
    int a[n], i;

    for (i = 0; i < n; i++)
    {
        printf("a[%d] = ", i); //Đẩy dữ liệu vào a[]
        scanf("%d", &a[i]);
    }

    printf("Cac so trong Array:\n");
    for (i = 0; i < n; i++)
    {
        printf("\t%d", a[i]); // Lấy dữ liệu a[]
    }

    // Max
    max = a[0]; // set max = 0 => Neu co so lon hon max => max la so do
    for (i = 1; i < n; i++)
    {
        if (a[i] >= max)
        {
            max = a[i];
        }
    }
    printf("\nMax: %d", max);

    // Min
    min = a[0];
    for (i = 1; i < n; i++)
    {
        if (a[i] <= min)
        {
            min = a[i];
        }
    }
    printf("\nMin: %d", min);

    return 0;
}
