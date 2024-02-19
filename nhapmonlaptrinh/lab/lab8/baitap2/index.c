#include <stdio.h>
#include <stdlib.h>

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
    for (i = 0; i < n; i++)
    {
        printf("\nthong tin vua nhap la: ");
        printf("\nho va ten la: %s", a1[i].hoten);
        printf("\nMSSV :%s", a1[i].mssv);
        printf("\nNganh hoc la:%s", a1[i].nganhhoc);
        printf("\nDiem :%f", a1[i].diem);
    }
    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (a1[i].diem > a1[j].diem)
            {
                struct sinhvien tg;
                tg = a1[i];
                a1[i] = a1[j];
                a1[j] = tg;
            }
        }
    }
    printf("\nchuoi sau khi sap xep la: ");
    for (i = 0; i < n; i++)
    {
        printf("\nthong tin vua nhap la: ");
        printf("\nho va ten la: %s", a1[i].hoten);
        printf("\nMSSV :%s", a1[i].mssv);
        printf("\nNganh hoc la:%s", a1[i].nganhhoc);
        printf("\nDiem :%f", a1[i].diem);
    }
    return 0;
}