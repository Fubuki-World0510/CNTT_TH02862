#include <stdio.h>

int main()
{
    int menu;
    do
    {
        printf("========[MENU FR]=================================\n");
        printf("1. Kiem tra so nguyen\n");
        printf("2. Tim uoc so chung va boi so so chung cua 2 so\n");
        printf("3. Tinh tien quan karaoke\n");
        printf("4. Tinh tien dien\n");
        printf("5. Chuyen doi tien\n");
        printf("6. Tinh lai suat vay va tra gop\n");
        printf("7. Vay tien mua xe\n");
        printf("8. Sap xep thong tin sinh vien\n");
        printf("9. Game FPOLY-LOTT\n");
        printf("10. Tinh phan so\n");
        printf("11. Cut luon\n\n");
        printf("Lua chon cua ban la [1 -> 11]: ");
        scanf("%d", &menu);

        switch (menu)
        {
        case 1:
            printf("Day la chuc nang 1\n\n");
            break;
        case 2:
            printf("Day la chuc nang 2\n\n");
            break;
        case 3:
            printf("Day la chuc nang 3\n\n");
            break;
        case 4:
            printf("Day la chuc nang 4\n\n");
            break;
        case 5:
            printf("Day la chuc nang 5\n\n");
            break;
        case 6:
            printf("Day la chuc nang 6\n\n");
            break;
        case 7:
            printf("Day la chuc nang 7\n\n");
            break;
        case 8:
            printf("Day la chuc nang 8\n\n");
            break;
        case 9:
            printf("Day la chuc nang 9\n\n");
            break;
        case 10:
            printf("Day la chuc nang 10\n\n");
            break;
        case 11:
            break;
        default:
            printf("Nhap sai roi ban");
            break;
        }
    } while (menu != 11);
}