#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define MB_TOPMOST 0x0004
#include <unistd.h>
#include <windows.h>
#include <time.h>
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
int cn4(int dien)
{
    const float muc1 = 1678, muc2 = 1734, muc3 = 2014, muc4 = 2536, muc5 = 2834, muc6 = 2927;
    float tien;
    if (dien <= 50)
        tien = dien * muc1;
    else if (dien <= 100)
        tien = 50 * muc1 + (dien - 50) * muc2;
    else if (dien <= 200)
        tien = 50 * muc1 + muc2 * 50 + (dien - 100) * muc3;
    else if (dien <= 300)
        tien = 50 * (muc1 + muc2) + 100 * muc3 + (dien - 100) * muc4;
    else if (dien <= 400)
        tien = 50 * (muc1 + muc2) + muc3 * 100 + muc4 * 100 + (dien - 100) * muc5;
    else if (dien >= 401)
        tien = 50 * (muc1 + muc2) + (muc3 + muc4 + muc5) * 100 + (dien - 100) * muc6;
    return tien;
}
void cn5(int soTien)
{
    int gia[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int soTo;
    for (int i = 0; i < 9; i++)
    {
        soTo = soTien / gia[i];
        if (soTo > 0)
        {
            printf("Menh gia %d: %d to\n", gia[i], soTo);
            soTien %= gia[i];
        }
    }
}
void cn6()
{
    double vay, tongTien = 0;
    int kyHan = 12;
    double laiSuat = 0.05;
    double laiHangThang;
    printf("CHO VAY NANG LAI\n");
    Sleep(1000);
    system("cls");
    printf("CHO VAY NANG LAI\n");
    printf("Dang vao chuc nang .");
    Sleep(1000);
    system("cls");
    printf("CHO VAY NANG LAI\n");
    printf("Dang vao chuc nang ..");
    Sleep(1000);
    system("cls");
    printf("CHO VAY NANG LAI\n");
    printf("Dang vao chuc nang ...");
    Sleep(2000);
    system("cls");
    printf("CHO VAY NANG LAI\n");
    printf("Cuoc song be tac khien ban phai lam vay\n");
    Sleep(2000);
    printf("Nhung dung lo lang, hay nhap so tien ban muon: ");
    scanf("%lf", &vay);

    double tienGocHangThang = vay / kyHan;
    double tongTienThang;

    for (int i = 0; i < kyHan; i++)
    {
        laiHangThang = vay * laiSuat;
        tongTienThang = laiHangThang + tienGocHangThang;
        tongTien += tongTienThang;
        vay = vay - tienGocHangThang;
        printf("Thang %d: Lai: %.0lf\tTien Goc: %.0lf\tTong Tien: %.0lf\tCon No: %.0lf\n", i + 1, laiHangThang, tienGocHangThang, tongTienThang, vay);
    }

    printf("Cai gia ma may phai tra la %.0lf\n", tongTien);
}
//[Chuc nang 8 - START]=======================================
struct SinhVien
{
    char ten[999];
    float diem;
    char hocLuc[999];
};

void thongtin(struct SinhVien danhsach[], int *n)
{
    int i;

    printf("\nNhap so luong sinh vien: ");
    scanf("%d", n);

    for (i = 0; i < *n; i++)
    {
        printf("\nNhap thong tin sinh vien %d: \n", (i + 1));
        fflush(stdin);

        printf("Ten: ");
        gets(danhsach[i].ten);
        printf("Diem: ");
        scanf("%f", &danhsach[i].diem);
    }
}

void sort(struct SinhVien danhsach[], int n)
{
    int i, j;

    for (i = 0; i < n; i++)
    {
        for (j = n; j > i; j--)
        {
            if (danhsach[j].diem > danhsach[j - 1].diem)
            {
                struct SinhVien dstamthoi = danhsach[j];
                danhsach[j] = danhsach[j - 1];
                danhsach[j - 1] = dstamthoi;
            }
        }
    }
}

void hocLuc(struct SinhVien danhsach[], int n)
{
    int i;

    for (i = 0; i < n; i++)
    {
        if (danhsach[i].diem >= 9)
            strcpy(danhsach[i].hocLuc, "Xuat sac");
        else if (danhsach[i].diem >= 8)
            strcpy(danhsach[i].hocLuc, "Gioi");
        else if (danhsach[i].diem >= 6.5)
            strcpy(danhsach[i].hocLuc, "Kha");
        else if (danhsach[i].diem >= 5)
            strcpy(danhsach[i].hocLuc, "Trung binh");
        else
            strcpy(danhsach[i].hocLuc, "Yeu");
    }
}

void display(struct SinhVien danhsach[], int n)
{
    int i;

    printf("\nSinh vien\tDiem\tHoc luc\n");

    for (i = 0; i < n; i++)
    {
        printf("%s\t\t%g\t%s\n", danhsach[i].ten, danhsach[i].diem, danhsach[i].hocLuc);
    }
}
//[Chuc nang 8 - END]=======================================

void cn9()
{
    int a;
    int b, c;
    int count = 0;
    printf("So thu nhat: \n");
    scanf("%d", &b);
    printf("So thu hai: \n");
    scanf("%d", &c);
    srand(time(0));
    printf("So trung thuong:\n");
    for (int i = 0; i < 2; i++)
    {
        a = rand() % 15;
        printf("%10d", a);
        if (b == a || c == a)
        {
            count++;
        }
    }
    if (count == 0)
    {
        printf("\nBuon roi ban\n");
    }
    else if (count == 1)
    {
        printf("\nGiai nhi da qua luon ban\n");
    }
    else
    {
        printf("OMGGGGG BAN GIAI NHAT, HUUUUUUUUUUUU\n");
    }
}
void cn7()
{
    double vay = 500000000;
    int hanVay = 24 * 12;
    double laiSuat = 0.072;

    double phanTramVay;
    printf("So phan tram vay: ");
    scanf("%lf", &phanTramVay);

    double traTruoc = vay * (1 - phanTramVay / 100);
    double conLai = vay - traTruoc;
    double laiSuatThang = laiSuat / 12;
    double laiHangThang = 0;
    double tienGocThang = conLai / hanVay;
    double tongTienTra = traTruoc;

    printf("\nTHONG TIN VAY MUA XE\n");
    printf("Thoi han vay: %d", hanVay);
    printf("So tien vay: %.0lf VND\n", vay);
    printf("So phan tram tra truoc: %.2lf%%\n", phanTramVay);
    printf("So tien tra truoc: %.0lf VND\n", traTruoc);
    printf("So tien con lai: %.0lf VND\n", conLai);
    printf("Thoi han vay: %d thang\n", hanVay);
    printf("Lai suat nam: %.2lf%%\n", laiSuat);

    // printf("\nBANG KE HOACH TRA GOP HANG THANG\n");
    // printf("Thang\tLai Hang Thang\tTien Goc Hang Thang\tTong Tien Tra\n");

    // for (int i = 1; i <= hanVay; i++)
    // {
    //     laiHangThang = conLai * laiSuatThang;
    //     tongTienTra += laiHangThang + tienGocThang;
    //     conLai -= tienGocThang;

    //     printf("%d\t%.0lf\t\t%.0lf\t\t\t%.0lf\n", i, laiHangThang, tienGocThang, tongTienTra);
    // }
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
            system("cls");
            printf("Day la chuc nang 1\n\n");
            cn1();
            break;
        case 2:
            system("cls");
            printf("Day la chuc nang 2\n\n");
            cn2();
            break;
        case 3:
            system("cls");
            printf("Day la chuc nang 3\n\n");
            cn3();
            break;
        case 4:
            system("cls");
            printf("Day la chuc nang 4\n\n");
            int dienluc;
            printf("nhap dien: ");
            scanf("%d", &dienluc);
            printf("So tien may can tra la: %d\n", cn4(dienluc));
            break;
        case 5:
            system("cls");
            printf("Day la chuc nang 5\n\n");
            int soTien;
            printf("Nhap vao so tien can doi: ");
            scanf("%d", &soTien);
            cn5(soTien);
            break;
        case 6:
            system("cls");
            printf("Day la chuc nang 6\n\n");
            cn6();
            break;
        case 7:
            system("cls");
            printf("Day la chuc nang 7\n\n");
            cn7();
            break;
        case 8:
            system("cls");
            printf("Day la chuc nang 8\n\n");
            struct SinhVien danhsach[40];
            int n;
            thongtin(danhsach, &n);
            sort(danhsach, n);
            hocLuc(danhsach, n);
            display(danhsach, n);
            break;
        case 9:
            system("cls");
            printf("Het cuu, toi khong biet lam chuc nang nay\n\n");
            cn9();
            break;
        case 10:
            system("cls");
            printf("Het cuu, toi khong biet lam chuc nang nay\n\n");
            break;
        case 11:
            break;
        default:
            MessageBoxW(NULL, L"Ban da nhap sai so", L"Thong tin", MB_OK | MB_ICONSTOP | MB_TOPMOST);
            break;
        }
    } while (menu != 11);
}














/*
+-------------------+
| INFO ASSIGNMENT   |
|                   |
|  Họ tên:          |
|  Trần Hải Nam     |
|                   |
|  MSSV:            |
|  TH02862          |
|                   |
|  Github:          |
|  Fubuki-World0510 |
+-------------------+
- Nâng cấp:
 + Message Box khi nhập sai số trong menu
 + Khởi động chương trình vay nợ
 + Table các thông tin sắp xếp
*/