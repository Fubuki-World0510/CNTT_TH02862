#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct sinhvien
{
    char hoten[30];
    char mssv[20];
    char nganhhoc[50];
    float diem;
};
int main(int argc, char *argv[])
{
    int n, i, j;
    printf("nhap so sv: ");
    scanf("%d", &n);
    getchar();
    struct sinhvien a1[n];
    for (i = 0; i < n; i++)
    {
        printf("nhap ho ten: ");
        fgets(a1[i].hoten, 30, stdin);
        printf("nhap mssv: ");
        fgets(a1[i].mssv, 20, stdin);
        printf("nhap nganh hoc: ");
        fgets(a1[i].nganhhoc, 50, stdin);
        printf("nhap diemtb: ");
        scanf("%f", &a1[i].diem);
        getchar();
    }
    char msv[50];
    printf("Nhap mssv: ");
    gets(msv);
    for (i = 0; i < 0; i++) {
        if(strcmp(msv, a1[i].mssv) == 0) {
            printf("Ho ten: %s\n", a1[i].hoten);
            printf("Nganh hoc: %s\n", a1[i].nganhhoc);
            printf("Diem: %s\n", a1[i].diem);
            printf("MSSV: %s\n", a1[i].mssv);
        }
    }
        return 0;
}