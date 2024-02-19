#include <stdio.h>

int main() {
    char hoten[40], mssv[40], quequan[50];
    int diem;
    printf("Ho va ten: ");
    gets(hoten);
    printf("MSSV: ");
    gets(mssv);
    printf("Diem: ");
    scanf("%d", &diem);
    fflush(stdin);
    printf("Que quan: ");
    gets(quequan);
    printf("Thi ra la vay, vay ban ten la %s co mssv la %s va ban co diem la %.1f diem, co phai ban o %s ?", hoten, mssv, (float)diem, quequan);
}