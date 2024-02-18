#include <stdio.h>
#include <math.h>

// 🎇
int bcnn(int a, int b)
{
    int max = a > b ? a : b;
    int kq = max;
    while (1)
    {
        if (max % a == 0 && max % b == 0)
        {
            kq = max;
            break;
        }
        ++max;
    }
    return kq;
}

// 🐘
void cn1()
{
    int x;
    int i = 2;
    int c = 0;
    printf("Moi ban nhap mot so nguyen: \n");
    scanf("%d", &x);
    printf("Day la thong tin cua con so ma ban vua nhap ra\n");
    if (x == (int)x)
        printf("So nguyen: true\n");
    else
        printf("So nguyen: false\n");
    while (i < x)
    {
        for (i = 2; i < x; i++)
        {
            if (x % i == 0)
                c++;
        }
    }
    if (c == 0)
        printf("Nguyen to: true\n");
    else
        printf("Nguyen to: false\n");
    int count = 0;
    for (int i = 1; i < x; i++)
    {
        if (i * i == x)
        {
            count++;
        }
    }
    if (count == 0)
        printf("Chinh phuong: true\n\n");
    else
        printf("Chinh phuong: false\n\n");
}

void cn2()
{
    int a, b;
    printf("Nhap 2 so bat ky di ban: ");
    scanf("%d", &a);
    printf("Nhap tiep so nua di, dm: ");
    scanf("%d", &b);

    printf("Boi so nho nhat la %d\n", bcnn(a, b));
    if (a == 0 || b == 0)
    {
        printf("ket qua ngu nhu cho: %d", a + b);
    }
    while (a != b)
    {
        if (a > b)
        {
            a = a - b;
        }
        else
        {
            b = b - a;
        }
    }
    printf("Ucln: %d\n\n", a);
}
void cn3()
{
    int gioBatDau, gioKetThuc;
    int tongGio;
    float giaTien;
    printf("Nhap gio bat dau: ");
    scanf("%d", &gioBatDau);
    printf("Nhap gio ket thuc: ");
    scanf("%d", &gioKetThuc);
    // check==========================
    tongGio = gioKetThuc - gioBatDau;

    if (gioBatDau >= 12 && gioBatDau <= 23)
    {
        if (tongGio <= 3)
        {
            giaTien = tongGio * 150000;
            // check==========================
        }
        else
        {
            giaTien = 450000 + (tongGio - 3) * 105000;
            // Lỗi[150000/h -> 450000]==========================
            if (gioBatDau >= 14 && gioBatDau <= 17)
            {
                giaTien = giaTien * 0.9;
            }

            // if (tongGio >= 4) {
            //     giaTien = 450000+(gio-3)*105000;
            // }
        }
        if (gioBatDau >= 14 && gioBatDau < 17)
        {
            printf("Gia tien can thanh toan: %.2f\n", giaTien * 0.9);
        }
        else
        {
            printf("Gia tien can thanh toan: %.2f\n", giaTien);
        }
    }
    else
    {
        printf("Quan chi hoat dong tu 12 gio den 23 gio.\n");
    }
}
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
            cn1();
            break;
        case 2:
            printf("Day la chuc nang 2\n\n");
            cn2();
            break;
        case 3:
            printf("Day la chuc nang 3\n\n");
            cn3();
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