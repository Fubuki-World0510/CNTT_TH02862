#include <stdio.h>
int main()
{
    int min, max, menu, tong, count;
    int x;
    int i = 2;
    int c = 0;
    do
    {
        printf("\n++--------------------------------------++\n");
        printf("|1:Tinh trung binh tong                  |\n");
        printf("|2:Tim so nguyen to                      |\n");
        printf("|3:Tim so chinh phuong                   |\n");
        printf("|4:Thoat                                 |\n");
        printf("++--------------------------------------++\n");

        printf("Xin moi ban chon chuc nang(1,2,3,4):");

        scanf("%d", &menu);
        switch (menu)
        {
        case 1:
            printf("Ban da chon tinh trung binh tong: \n");

            count = 0;
            printf("Min: ");
            scanf("%d", &min);
            printf("Max: ");
            scanf("%d", &max);
            while (min <= max)
            {
                if (min % 2)
                    printf(" ");
                else
                {
                    count++;
                    printf("Cac so chan: %d \n", min);
                    tong = tong + min;
                }
                min++;
            }
            printf("Tong cac so chan: %d \n", tong);
            printf("Chia trung binh: %f", (float)tong / count);
            break;
        case 2:
            printf("Ban da chon tim so nguyen to: \n");
            printf("Nhap so: ");
            scanf("%d", &x);

            while (i < x)
            {
                for (i = 2; i < x; i++)
                {
                    if (x % i == 0)
                    {
                        c++;
                    }
                }
            }
            if (c == 0)
                return printf("SO NGUYEN TO");
            else
                return printf("ISN'T SO NGUYEN TO");
            break;
        case 3:
            printf("Ban da chon tim so chinh phuong:\n");

            int x;
            printf("So? ");
            scanf("%d", &x);

            int i2 = 1;
            int isChinhPhuong = 0;

            while (i2 * i2 <= x)
            {
                if (i2 * i2 == x)
                {
                    isChinhPhuong = 1;
                    break;
                }
                i2++;
            }

            if (isChinhPhuong)
            {
                printf("%d la so chinh phuong.\n", x);
            }
            else
            {
                printf("%d khong phai la so chinh phuong.\n", x);
            }
            break;
        case 4:
            printf("No, pp\n");
            break;
        }
    } while (menu != 4);
}
