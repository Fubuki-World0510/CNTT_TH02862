#include <stdio.h>
#include <string.h>
#include <math.h>
#include <Windows.h>
void cn1()
{
    char monHoc[99];
    char maMon[99];
    int tinChi, tin;
    printf("THONG TIN MON HOC\n");
    printf("Nhap mon hoc: ");
    gets(monHoc);
    printf("\nNhap ma mon: ");
    gets(maMon);
    printf("\nNhap so tin chi: ");
    scanf("%d", &tinChi);
    fflush(stdin);
    system("cls");
    printf("THONG TIN MON HOC\n");
    printf("Mon hoc: %s\n", monHoc);
    printf("Ma mon: %s\n", maMon);
    printf("Tin chi: %d\n", tinChi);
    tin = tinChi;
    printf("Hoc phi: %d", (tinChi * 500)); //????? số tín chỉ = stc*500/tín (tín là cái gì?) ??????
}
void cn2()
{
    int n, a = 0, b = 0;
    printf("Nhap n: ");
    scanf("%d", &n);
    if (n % 2 == 0)
        printf("\n%d la so chan", n);
    else
        printf("\n%d la so le", n);
    for (int i = 1; i <= n; i++)
    {
        if (i % 3 == 0)
        {
            a++;
        }
        if (i % 2 == 0)
        {
            b++;
        }
    }
    printf("\nCo %d so chia het cho 3 tu 1 -> %d", a, n);
    printf("\nCo %d so chan tu 1 -> %d", b, n);
}
void cn3()
{
    int sinhVien, tb = 0, tong = 0, koDuoi5 = 0;
    float max;
    printf("Nhap so sinh vien: ");
    scanf("%d", &sinhVien);
    float svArray[sinhVien];

    for (int i = 0; i < sinhVien; i++)
    {
        printf("\nNhap diem cua sinh vien %d: \n", i + 1);
        scanf("%f", &svArray[i]);
    }
    max = svArray[0];
    for (int i = 0; i < sinhVien; i++)
    {
        tb++;
        tong = tong + svArray[i];
        if (svArray[i] >= 5) {
            koDuoi5++;
        }
        if(svArray[i] > max) {
            max = svArray[i]
        }
        
    }
    printf("Diem trung binh: %.1f\n", tong / tb);
    printf("Diem cao nhat la %.1f", max);
    printf("Cac sinh vien khong duoi 5: %d\n", koDuoi5);
}

int main()
{
    int menu;
    do
    {
        printf("\n1. Thong tin mon hoc\n");
        printf("2. Tinh tong so le\n");
        printf("3. Diem lab\n");
        printf("0. Thoat\n");
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
        default:
            break;
        }
    } while (menu != 3);
}
