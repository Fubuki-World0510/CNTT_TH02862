#include <stdio.h>
#include <math.h>
#include <stdlib.h>

//[OPTION 1]======================================
void option1()
{
    float x;

    printf("Nhap diem ngay: ");
    scanf("%f", &x);

    if (x >= 9)
        printf("Diem %.f nay Xuat sac vl", x);
    else if (x >= 8)
        printf("Diem %.f nay Gioi vl", x);
    else if (x >= 6.5)
        printf("Diem %.f Kha day", x);
    else if (x >= 5)
        printf("Diem %.f nay Trung binh ban oiiii", x);
    else if (x >= 3.5)
        printf("Yeu the ban ?");
    else
        printf("Ngu the ban ?");
}
//[OPTION 2]======================================
void option2()
{
    float em, toi;

    printf("Nhap so a vao di em: ");
    scanf("%f", &em);
    printf("Nhap so b vao di em: ");
    scanf("%f", &toi);

    printf("OUTPUT: %f va %f\n", em, toi);
    if (em == 0)
    {
        if (toi == 0)
            printf("Vo so nghiem");
        else
            printf("Vo nghiem roi ban");
    }
    else
    {
        printf("Ket qua cua %1.fx+%1.f=0 la %1.f", em, toi, -toi / em);
    };
}
//[OPTION 3]======================================
void option3()
{
    float a, b, c, delta;
    printf("Nhap a: ");
    scanf("%f", &a);
    printf("Nhap b: ");
    scanf("%f", &b);
    printf("Nhap c: ");
    scanf("%f", &c);
//?????
    //???????
    if (a == 0)
    {
        printf("Day la phuong trinh bac nhat, ket qua la: %f", -c / b);
    }
    else
    {
        delta = (b * b - 4 * a * c);
        printf("Day la phuong trinh delta, ket qua la %f", delta);
        if (delta < 0)
            printf("Ptrinh vo nghiem roi ban\n");
        else if (delta == 0)
            printf("Nghiem kep x = %1.f", -b / (2 * a));
        else if (delta > 0)
        {
            printf("Co 2 nghiem rieng biet\n");
            printf("Nghiem 1: %f", -b + sqrt(delta) / (2 * a));
            printf("\nNghiem 2: %f", -b - sqrt(delta) / (2 * a));
        }
    }
}
//[OPTION 4]======================================
void option4()
{
    int sodien;
    printf("nhap dien: ");
    scanf("%d", &sodien);
    const float muc1 = 1678, muc2 = 1734, muc3 = 2014, muc4 = 2536, muc5 = 2834, muc6 = 2927;
    float sotien;
    if (sodien <= 50)
    {
        sotien = sodien * muc1;
    }
    else if (sodien <= 100)
    {
        sotien = 50 * muc1 + (sodien - 50) * muc2;
    }
    else if (sodien <= 200)
    {
        sotien = 50 * muc1 + muc2 * 50 + (sodien - 100) * muc3;
    }
    else if (sodien <= 300)
    {
        sotien = 50 * (muc1 + muc2) + 100 * muc3 + (sodien - 100) * muc4;
    }
    else if (sodien <= 400)
    {
        sotien = 50 * (muc1 + muc2) + muc3 * 100 + muc4 * 100 + (sodien - 100) * muc5;
    }
    else if (sodien >= 401)
    {
        sotien = 50 * (muc1 + muc2) + (muc3 + muc4 + muc5) * 100 + (sodien - 100) * muc6;
    }
    printf("so tien dien cua may: %f", sotien);
}

int main()
{
    int juefiheroi;
    printf("==== MENU LUA CHON ====\n");
    printf("1. Tinh hoc luc - lab3: bai 1\n");
    printf("2. Giai phuong trinh bac nhat - lab3: bai 2.1\n");
    printf("3. Giai phuong trinh bac hai - lab3: bai 2.2\n");
    printf("4. Chuong trinh tinh tien dien - Lab3 bai 3\n");
    printf("0. EXIT\n\n");
    printf("Lua chon cua ban la (1, 2, 3, 4): ");
    scanf("%d", &juefiheroi);

    switch (juefiheroi)
    {
    case 0:
        printf("Bye!");
        break;
    case 1:
        printf("[TINH HOC LUC]\n");
        option1();
        break;
    case 2:
        printf("[GIAI PHONG TRINH 1 AN]\n");
        option2();
        break;
    case 3:
        printf("[GIAI PHUONG TRINH 2 AN]\n");
        option3();
        break;
    case 4:
        printf("[TINH TIEN DIEN FOR REAL]\n");
        option4();
        break;
    default:
        printf("BAN DA NHAP SAI GIA TRI, LAM ON HAY CO NAO DUM TAO CAI");
        break;
    };
}