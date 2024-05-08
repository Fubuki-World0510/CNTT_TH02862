#include <stdio.h>
#include <string.h>
#include <Windows.h>
#include <math.h>

void cn1()
{
    int n;
    int tong = 0;
    printf("Nhap n: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            printf("\nCac so chan: %d", i);
            tong = tong + i;
        }
    }
    printf("\nTong cac so chan la: %d", tong);
}
void cn2()
{
    int max, n;
    printf("Nhap 4 so di ni\n");
    n = 4;
    int a[n];

    for (int i = 0; i < n; i++)
    {
        printf("a[%d] = ", i);
        scanf("%d", &a[i]);
    }
    for (int i = 0; i < 0; i++)
    {
        printf("So \t%d", a[i]);
    }

    max = a[0];
    for (int i = 0; i < n; i++)
    {
        if (a[i] >= max)
        {
            max = a[i];
        }
    }
    printf("Max cua day so la: %d", max);
}

void cn3()
{
    char ten[50], thanhPho[50];
    int tuoi;
    printf("NHAP THONG TIN CUA BAN\n");
    printf("Ten cua ban: ");
    gets(ten);
    printf("\nTuoi: ");
    scanf("%d", &tuoi);
    fflush(stdin);
    printf("\nThanh pho ban dang song: ");
    gets(thanhPho);

    printf("Thi ra ban ten la %s, ban da %d tuoi va ban dang so o %s", ten, tuoi, thanhPho);
}

void cn4()
{
    int n, max, min20;
    printf("Nhap so luong dong vat: ");
    scanf("%d", &n);
    int a[n];
    printf("\nSo luong dong vat la: %d", n);
    for (int i = 0; i < n; i++) {
        printf("\nNhap can nang cua con vat %d: ", i);
        scanf("%d", &a[i]);
    }
    max = a[0];
    for (int i = 0; i < n; i++) {
        if(a[i] > max) {
            max = a[i];
        }
    }
    printf("\nDong vat co so can nang lon nhat la: %d\n", max);

    for (int i = 0; i < n; i++)
    {
        if (a[i] < 20)
        {
            printf("\nCac dong vat co so luong can nang duoi 20 la: %d", a[i]);
        }
    }
}
int main()
{
    int menu;
    do
    {
        printf("\n1. Nhap n => cac so chan roi tinh tong tu 1 -> n\n");
        printf("2. Nhap 4 so nguyen in ra so lon nhat (tim MAX)\n");
        printf("3. Nhap ten, tuoi, dia chi, thanh pho ban than dang song\n");
        printf("4. Dong vat.com.vn\n");
        scanf("%d", &menu);
        fflush(stdin);

        switch (menu)
        {
        case 1:
            cn1();
            break;
        case 2:
            cn2();
            break;
        case 3:
            cn3();
            break;
        case 4:
            cn4();
            break;
        default:
            break;
        }
    } while (menu != 4);
}

/**
 * 1. Nhập n => các số chẵn rồi tính tổng từ 1 -> n
 * 2. Nhập 4 số nguyên in ra số lớn nhất (tìm MAX)
 * 3. Nhập tên, tuổi, địa chỉ, thành phố bản thân đang sống
 * 4. Nhập số lượng động vật và cân nặng động vật
 *  + In ra số lượng động vật
 *  + Cân nặng động vật lớn nhất
 *  + Số lượng động vật <20Kg
 */