#include <stdio.h>
int dopdopyetyet(int nam)
{
    if (nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0)
        return 1;
    else
        return 0;
}
int main()
{
    int skib;
    printf("Nhap so nam di bn: ");
    scanf("%d", &skib);
    
    if (dopdopyetyet(skib) == 1) {
        printf("La nam Juan nhe ban");
    } else {
        printf("La nam bth thoi ban");
    }
        return 0;
}