#include <stdio.h>
#include <string.h>

int main() {
    char mssv[10], hoten[20], tuoi[100], diachi[203], nganh[999];
    printf("Nhap MSSV: ");
    gets(mssv);
    printf("Nhap Ho va ten: ");
    gets(hoten);
    printf("Nhap tuoi: ");
    gets(tuoi);
    printf("Nhap dia chi: ");
    gets(diachi);
    printf("Nhap nganh: ");
    gets(nganh);

    printf("MSSV %s\t\n", mssv);
    printf("Nhap Ho va ten %s\t\n", hoten);
    printf("Nhap tuoi %s\t\n", tuoi);
    printf("Nhap dia chi %s\t\n", diachi);
    printf("Nhap nganh %s\t\n", nganh);
}