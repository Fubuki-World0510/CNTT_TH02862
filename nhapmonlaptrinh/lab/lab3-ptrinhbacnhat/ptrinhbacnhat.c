#include <stdio.h>
#include <math.h>

int main() {
    float x, y;

    printf("Nhap x: ");
    scanf("%f", &x);
    printf("Nhap y: ");
    scanf("%f", &y);

    if(x == 0) {
        if(y == 0) {
            printf("Vo so nghiem");
        } else {
            printf("Vo nghiem");
        };
    } else {
        printf("Co nghiem, ket qua la: %2.f", -y/x);
    };
    return 0;
}