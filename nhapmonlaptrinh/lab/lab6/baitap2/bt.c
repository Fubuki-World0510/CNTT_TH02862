#include <stdio.h>

int main()
{
    int max;
    printf("Nhap n di nhoc");
    scanf("%d", &max);
    int a[max];
    int im = 1;

    for (int i = 0; i < max; i++)
    {
        printf("Nhap a[%d]", i);
        scanf("%d", &a[i]);
    }
    for (int i = 0; i < max; i++)
    {
        if(a[i] > max) {
            
        }
    }
}