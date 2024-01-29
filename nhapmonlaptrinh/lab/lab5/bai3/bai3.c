#include <stdio.h>

void hoanvipls(int a, int b)
{
    int tg, aR, bR;
    aR = a;
    bR = b;
    tg = a;
    a = b;
    b = tg;
    printf("Hoan vi %d va %d", a, tg);
}

int main()
{
    int a, b;


    printf("Nhap a");
    scanf("%d", &a);
    printf("Nhap b");
    scanf("%d", &a);
    hoanvipls(a, b);
    return 0;
}