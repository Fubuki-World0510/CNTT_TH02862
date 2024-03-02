#include <stdio.h>
#include <string.h>
#include <math.h>

void cn1()
{
    char ten[50], ma[50];
    float gia;
    printf("NHAP THONG TIN SAN PHAM\n");
    printf("Nhap ten san pham: ");
    gets(ten);
    printf("Nhap ma san pham: ");
    gets(ma);
    printf("Nhap gia san pham: ");
    scanf("%f", &gia);

    printf("Hang %s co ma san pham la %s va gia cua no la %.1f (Bao gom 15 phan tram gia)", ten, ma, gia * 0.15);
}

void cn2(int n)
{
    int tong = 0, i = 1;

    for (i = 1; i <= n; i++)
    {
        if (i % 3 == 0)
        {
            tong = tong + i;
        }
        if (i % 5 == 0)
        {
            printf("So %d chia het cho 5\n", i);
        }
    }
    printf("Tong cac so chia het cho 3 tu 1 -> %d la: %d\n", n, tong);
}

void cn3()
{
    int soLuong, max, sachHight = 0, i = 0;
    printf("Nhap so luong sach: ");
    scanf("%d", &soLuong);
    int giaBan[soLuong];

    for (i = 0; i < soLuong; i++)
    {
        printf("\nMoi ban nhap gia tien cua sach %d: ", i + 1);
        scanf("%d", &giaBan[i]);
    }
    max = giaBan[0];
    for (i = 0; i < soLuong; i++)
    {
        if (giaBan[i] > max)
        {
            max = giaBan[i];
        }
        if (giaBan[i] > 12000)
        {
            sachHight++;
        }
    }
    printf("Co %d sach trong cua hang\n", soLuong);
    printf("Gia %d la gia cao nhat\n", max);
    printf("Co %d so sach co gia ban tren 12000\n", sachHight);
}
int main()
{
    int menu, emu;
    do
    {
        printf("\n1. Thong tin san pham\n");
        printf("2. Tinh tong cac so chia het cho 3\n");
        printf("3. Thong tin sach\n");
        printf("0. Thoat\n");
        scanf("%d", &menu);
        fflush(stdin);
        switch (menu)
        {
        case 1:
            cn1();
            break;
        case 2:
            printf("Nhap n: ");
            scanf("%d", &emu);
            cn2(emu);
            break;
        case 3:
            cn3();
            break;
        }
    } while (menu != 3);
}

