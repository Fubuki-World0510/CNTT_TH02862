#include <stdio.h>
#include <windows.h>
#include <string.h>
struct nhanvien
{
    char tenNV[50];
    int namSinh;
    char queQuan[90];
    char maNV[90];
};
struct sinhVien
{
    float toan;
    float van;
    char mssv[99];
};
struct sanPham
{
    char maSP[99];
    char tenSP[50];
    float giaTien;
};

int main()
{
    struct nhanvien nv;
    struct sinhVien sv;
    struct sanPham sp;

    int menu;
    do
    {
        printf("1. Nhap thong tin Nhan Vien\n");
        printf("2. Nhap thong tin va diem sinh vien\n");
        printf("3. Nhap thong tin san pham\n");
        printf("0. Cut\n");
        printf("Lua chon cua ban [1 -> 3]");
        scanf("%d", &menu);
        fflush(stdin);
        switch (menu)
        {
        case 1:
            printf("THONG TIN NHAN VIEN\n");
            printf("Moi ban nhap thong tin nhan vien nhu sau\n");
            printf("Ho va ten: \n");
            gets(nv.tenNV);
            printf("Ma nhan vien: \n");
            gets(nv.maNV);
            fflush(stdin);
            printf("Nam sinh: \n");
            scanf("%d", &nv.namSinh);
            printf("Que quan: \n");
            fflush(stdin);
            gets(nv.queQuan);
            printf("Thi ra nhan vien cua ban ten la %s (%s), ban sinh nam %d va ban co que quan o %s\n", nv.tenNV, nv.maNV, nv.namSinh, nv.queQuan);
            break;
        case 2:
            system("cls");
            printf("THONG TIN SINH VIEN\n");
            printf("Moi ban nhap thong tin sinh vien nhu sau\n");
            printf("MSSV: \n");
            gets(sv.mssv);
            printf("Diem toan: \n");
            scanf("%f", &sv.toan);
            fflush(stdin);
            printf("Diem van: \n");
            scanf("%f", &sv.van);
            system("cls");
            printf("THONG TIN SINH VIEN\nSinh vien: %s\nDiem toan: %.1f\nDiem van: %.f\n", sv.mssv, sv.toan, sv.van);
            break;
        case 3:
        {
            system("cls");
            printf("THONG TIN MA SAN PHAM\n");
            printf("Moi ban nhap thong tin san pham\n");
            printf("Ma san pham: \n");
            gets(sp.maSP);
            printf("Ten san pham: \n");
            gets(sp.tenSP);
            printf("Gia tien: \n");
            scanf("%f", &sp.giaTien);
            fflush(stdin);
            system("cls");
            printf("THONG TIN SAN PHAM\nSan pham: %s\nMa san pham: %s\nGia tien: %.1f", sp.tenSP, sp.maSP, sp.giaTien);
        }
        break;
        default:
            break;
        }
    } while (menu != 3);
}