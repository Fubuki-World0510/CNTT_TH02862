#include <stdio.h>

void hoanvipls(int *a, int *b)
{
    int tg;
    tg = *a;
    *a = *b;
    *b = tg;
    printf("Hoan vi %d va %d\n", *a, *b);
}

int main()
{
    int a, b;

    printf("Nhap a: ");
    scanf("%d", &a);
    printf("Nhap b: ");
    scanf("%d", &b);
    hoanvipls(&a, &b);
    return 0;
}
