#include <stdio.h>

int main() {
	int min;
	int max;
	int tong;
	int count;
	
	count = 0;
	printf("Min: ");
	scanf("%d", &min);
	printf("Max: ");
	scanf("%d", &max);
	while(min <= max) {
		if(min%2) printf(" ");
		else {
			count++;
			printf("Cac so chan: %d \n", min);
			tong = tong + min;
		}
		min++;
	} printf("Tong cac so chan: %d \n", tong);
	printf("Chia trung binh: %f", (float)tong/count);
	return 0;
}
