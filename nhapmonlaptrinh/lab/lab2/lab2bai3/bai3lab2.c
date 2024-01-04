#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float i;
	
	printf("Nhap ban kinh: ");
	scanf("%f",&i);
	printf("Chu vi la: %f", i*2*3.14);
 	return printf("\nDien tich la: %f", i*i*3.14);
}
