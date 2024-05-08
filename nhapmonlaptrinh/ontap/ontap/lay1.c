#include <stdio.h>

struct cn1
{
    char lop[999];
    char gvcn[999];
    int siso;
};

int main()
{
    struct cn1 cn;
    int lop, a, b, c, n, menu, i;
    printf("1. Nhap ten lop, gvcn, si so lop in ra thong tin vua nhap\n");
    printf("2. Tinh tong cac so tu 1 den so vua nhap\n");
    printf("3. Thong tin may giat cua hang (Deo ai hoi)\n");
    printf("4. Cut\n");
    scanf("%d", &menu);
    fflush(stdin);

    switch (menu)
    {
    case 1:
        printf("Moi ban nhap lop\n");
        gets(cn.lop);
        printf("Moi ban nhap gvcn\n");
        gets(cn.gvcn);
        printf("Moi ban nhap si so\n");
        scanf("%d", &cn.siso);
        printf("Ban o lop %s, gvcn cua ban la %s va lop ban co si so la %d\n\n", cn.lop, cn.gvcn, cn.siso);
        break;
    case 2:
        printf("Nhap so di bri: ");
        scanf("%d", &a);
        for (i = 1; i <= a; i++)
        {
            i = i + a;
        }
        printf("Tong la %d", i);
        if (a % 2 == 0)
        {
            printf("Cac so duong: %d", i);
        }
        break;
    default:
        break;
    }
    scanf("%d", &n);

    return 0;
}