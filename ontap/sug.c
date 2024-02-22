#include <stdio.h>
#include <math.h>

// Đề bài: Nhập số vào N in ra màn hình các số chẵn từ 1 -> N sau đó tính tổng
int main()
{
    int n;
    int tong = 0;
    printf("Nhap n: \n");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            printf("\nCac so chan la: %d", i);
            tong = tong + i;
        }
    }
    printf("Tong lai la: %d", tong);
}