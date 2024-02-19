#include <stdio.h>
struct thongtin
{
    char hoten[80];
    char mssv[80];
    char nganh[80];
    float diem;
};
int main()
{
    int n;
    printf("Nhap so sinh vien");
    scanf("%d", &n);
    struct thongtin a[n];
    fflush(stdin);
    for (int i = 0; i < n; i++) {
        printf("Ho ten? ");
        gets(a[i].hoten);
        printf("MSSV? ");
        gets(a[i].mssv);
        printf("Nganh hoc? ");
        gets(a[i].nganh);
        printf("Diem? ");
        scanf("%f", &a[i].diem);
    }
    for (int i = 0; i < n; i++)
    {
        printf("Thong tin sinh vien %d: \n%s\n%s\n%d\n%s", i, a[i].hoten, a[i].mssv, a[i].diem, a[i].nganh);
    }
}