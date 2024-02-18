#include <stdio.h>

int main() {
    int gioBatDau, gioKetThuc;
    int tongGio;
    float giaTien;

    printf("Nhap gio bat dau: ");
    scanf("%d", &gioBatDau);

    printf("Nhap gio ket thuc: ");
    scanf("%d", &gioKetThuc);
//check==========================
    tongGio = gioKetThuc - gioBatDau;

    if (gioBatDau >= 12 && gioBatDau <= 23) {
        if (tongGio <= 3) {
            giaTien = tongGio * 150000;
            //check==========================
        } else {
            giaTien = 450000 + (tongGio - 3) * 105000;
//Lỗi[150000/h -> 450000]==========================
            if (gioBatDau >= 14 && gioBatDau <= 17) {
                giaTien = giaTien * 0.9;
            }

            // if (tongGio >= 4) {
            //     giaTien = 450000+(gio-3)*105000;
            // }
        }
        if (gioBatDau >= 14 && gioBatDau < 17) {
            printf("Gia tien can thanh toan: %.2f\n", giaTien * 0.9);
        } else {
            printf("Gia tien can thanh toan: %.2f\n", giaTien);
        }
    } else {
        printf("Quan chi hoat dong tu 12 gio den 23 gio.\n");
    }

    return 0;
}