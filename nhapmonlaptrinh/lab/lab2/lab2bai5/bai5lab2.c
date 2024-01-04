#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	float a, b;
	
	printf("Nhap gia tri a: ");
	scanf("%f",&a);
	printf("Nhap gia tri b: ");
	scanf("%f",&b);
	printf("Phuong trinh ");
	printf("%.fx + %.f = 0 \n", a, b);
	printf("X = %.f", b/a);
	return 0;
}
