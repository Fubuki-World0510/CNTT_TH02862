#include <stdio.h>
#include <math.h>


int main()
{
    float a, b, c, delta;
    printf("Nhap a: ");
    scanf("%f", &a);
    printf("Nhap b: ");
    scanf("%f", &b);
    printf("Nhap c: ");
    scanf("%f", &c);

    if(a == 0) {
        //bx+c=0
        if(b == 0) {
            if(c == 0) {
                printf("Vo so nghiem");
            } else {
                printf("Vo nghiem");
            }
        } else if(b != 0) {
            //x=-c/b
            printf("Phuong trinh b khac 0, ket qua: %f", -c/b);
        }
    } else if(a != 0) {
        //b^2 - 4ac
        delta = b*b-4*a*c;
        if(delta < 0) {
            printf("Vo nghiem Delta");
        } else if(delta == 0) {
            //Co nghiem kep
            //x = -b/2a
            printf("Delta co nghiem kep: %f", -b/2*a);
        } else {
            //Ptrinh co 2 nghiem
            //X1 va X2
            printf("Delta co 2 nghiem\n");
            printf("X1: %f", -b - sqrt(delta) / (2*a));
            printf("\nX2: %f", -b - sqrt(delta) / (2 * a));
        }
    }
}