#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float toan, ly, hoa;
	
	printf("Nhap toan: ");
	scanf("%f",&toan);
	printf("Nhap ly: ");
	scanf("%f",&ly);
	printf("Nhap hoa: ");
	scanf("%f",&hoa);
	
	printf("Diem trung binh la: %.1f", (toan*3+ly*2+hoa*1)/6);
	return 0;
}
