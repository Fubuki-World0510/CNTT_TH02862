#include <stdio.h>
#include <math.h>
int main() {
	float a, b, c, delta;
	printf("Nhap a: ");
	scanf("%f", &a);
	printf("Nhap b: ");
	scanf("%f", &b);
	printf("Nhap c: ");
	scanf("%f", &c);
	
	//???????
	if(a == 0) { printf("Day la phuong trinh bac nhat, ket qua la: %f", -c/b); } else { delta = (b*b-4*a*c); printf("Day la phuong trinh delta, ket qua la %f", delta); if(delta < 0) return printf("Ptrinh vo nghiem roi ban\n"); else if(delta == 0) return printf("Nghiem kep x = %1.f", -b/(2*a)); else if(delta > 0) { printf("Co 2 nghiem rieng biet"); printf("Nghiem 1: %f", -b+sqrt(delta)/(2*a)); printf("\nNghiem 2: %f", -b-sqrt(delta)/(2*a)); } }
	return 0;
}
