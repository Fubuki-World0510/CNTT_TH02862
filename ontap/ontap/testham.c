#include <stdio.h>

void thang(int thang)
{
    if(thang > 0) {
        if(thang < 3) {
            printf("Ban biet ong Xuan khong?");
        } else if(thang < 6) {
            printf("Ban biet ong Ha khong?");
        } else if(thang < 9) {
            printf("Ban biet ong Thu khong?");
        } else if(thang < 12) {
            printf("Ban biet ong Dong khong?");
        }
    }
}

int main() {
    thang(10);
    int thanggay;
    printf("\nNhap thang di ni\n");
    scanf("%d", &thanggay);
    thang(thanggay);
}