#include <stdio.h>


int ham(int so1, int so2, int so3) {
    int max = so1;
    if(max < so2) max = so2;
    if (max < so3) max = so3;
    return max;
}

int main() {
    int a, b, c;
    printf("Nhap 3 so: ");
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    printf("Max = %d", ham(a, b, c));
    return 0;
}