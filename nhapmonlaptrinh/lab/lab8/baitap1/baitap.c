#include <stdio.h>
#include <string.h>
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
    printf("Nhap so sinh vien: ");
    scanf("%d", &n);

    struct thongtin a[n];

    while ((getchar()) != '\n');

    for (int i = 0; i < n; i++)
    {
        printf("Ho ten? ");
        fgets(a[i].hoten, sizeof(a[i].hoten), stdin);
        a[i].hoten[strcspn(a[i].hoten, "\n")] = '\0';

        printf("MSSV? ");
        fgets(a[i].mssv, sizeof(a[i].mssv), stdin);
        a[i].mssv[strcspn(a[i].mssv, "\n")] = '\0';

        printf("Nganh hoc? ");
        fgets(a[i].nganh, sizeof(a[i].nganh), stdin);
        a[i].nganh[strcspn(a[i].nganh, "\n")] = '\0';

        printf("Diem? ");
        scanf("%f", &a[i].diem);
        while ((getchar()) != '\n');
    }

    for (int i = 0; i < n; i++)
    {
        printf("Thong tin sinh vien %d: \n%s\n%s\n%.2f\n%s\n", i + 1, a[i].hoten, a[i].mssv, a[i].diem, a[i].nganh);
    }

    return 0;
}
