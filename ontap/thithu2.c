#include <stdio.h>
#include <math.h>
#include <string.h>
// NAM VIET DO HIHIHI :)))
struct self
{
    char ten[99];
    int tuoi;
};

void cn1()
{
    struct self s;
    printf("THONG TIN CA NHAN CUA BAN: \n");
    printf("Nhap ten: ");
    gets(s.ten);
    printf("Tuoi: ");
    scanf("%d", &s.tuoi);

    printf("Ten cua ban la %s va ban %d tuoi", s.ten, s.tuoi);
}

void cn2(int n)
{

    int tong = 0;
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
        if (i % 4 == 0)
        {
            count++;
        }
        if (i % 4 == 0 || i % 5 == 0)
        {
            tong = tong + i;
        }
    }
    printf("Co %d so chia het cho 4\n", count);
    printf("Tong cua cac so khi chia het cho 4 hoac 5 la: %d\n", tong);
}
void cn3()
{
    int nhap, tb = 0, tong = 0;

    printf("Moi ban nhap so luong doan duong can xay dung: ");
    scanf("%d", &nhap);
    int a[nhap];

    for (int i = 0; i < nhap; i++)
    {
        printf("\nMoi nhap do dai doan duong so %d: ", i + 1);
        scanf("%d", &a[i]);
    }
    for (int i = 0; i < nhap; i++)
    {
        printf("Duong so %d co do dai la: %d\n", i + 1, a[i]);
    }
    for (int i = 0; i < nhap; i++)
    {
        if (a[i] > 100)
        {
            printf("\nCac doan duong co do dai tren 100: %d\n", i + 1);
        }
        tb++;
        tong = tong + a[i];
    }
    printf("Trung binh cong cua cac doan duong la: %.1f", (float)tong / tb);
}
int main()
{
    int menu, a;
    do
    {
        printf("\n1. Thong tin ban than\n");
        printf("2. So chia het cho 4\n");
        printf("3. Thong tin cac doan duong\n");
        printf("0. Thoat\n");
        printf("Lua chon cua ban la? [0 -> 3]: ");
        scanf("%d", &menu);
        fflush(stdin);

        switch (menu)
        {
        case 1:
            cn1();
            break;
        case 2:
            printf("Nhap 1 so n nguyen duong: ");
            scanf("%d", &a);
            cn2(a); 
            if (a < 0)
               return printf("[CANH BAO]: BAN DANG NHAP SO NGUYEN AM\n");
            break;
        case 3:
            cn3();
            break;
        default:
            break;
        }
    } while (menu != 3);
}