#include <stdio.h>

int case2(int n) {
    int tong = 0;
    for (int i = 0; i < n; i++)
    {
        tong = tong + i;
    }
    return tong;
}
int case3(int )
int main()
{
    int menu;
    printf("====MENU=====\n1. Thong tin ca nhan\n2. Tinh tong 1->N\n3. In ra tong so chia het cho 5\n0. Cut\n\nChon cho tao ngay: ");
    scanf("%d", &menu);

    do
    {
        switch (menu)
        {
        case 1:
            printf("Oge ban iu oi, thong tin ca nhan cua minh nhu sau");
            break;
        case 2:
            int n;
            printf("Nhap so deptrai");
            scanf("%d", &n);
            printf("Tong cua may la: %d\n", case2(n));
            break;
        case 3:
            /* code */
            break;
        case 0:
            /* code */
            break;
        default:
            break;
        }
    } while (menu != 3);
}