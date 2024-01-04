#include <stdio.h>
#include <stdlib.h>

int main(int argc, char*argv[]) {
	int a, b;
	
	printf("Nhap so thu nhat: ");
	scanf("%d",&a);
	printf("Nhap so thu hai: ");
	scanf("%d",&b);
	printf("Tong %d + %d: %d", a, b, a+b);
	printf("\n Hieu %d - %d: %d", a, b, a-b);
	return 0;
}
