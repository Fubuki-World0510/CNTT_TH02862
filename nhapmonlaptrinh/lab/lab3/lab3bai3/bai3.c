#include <stdio.h>
#include <math.h>

int main()
{
    int dien;
    float tien;
    printf("Nhap so dien: ");
    scanf("%d", &dien);
    scanf("%f", &tien);
    const float muc1 = 1678;
    const float muc2 = 1734;
    const float muc3 = 2014;
    const float muc4 = 2536;
    const float muc5 = 2834;
    const float muc6 = 2927;


    if (dien <= 50)
    {
        tien = dien * 1678;
    }
    else if (dien <= 100)
    {
        tien = 50 * 1678 + (dien - 50) * 1734;
    }
    else if (dien <= 200)
    {
        tien = 50 * 1678 + (dien - 50) * 1734;
    }
}