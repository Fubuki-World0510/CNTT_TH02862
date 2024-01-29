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
    printf("Dop dop yet yet %d", dopdopyetyet(2024));
    return 0;
}