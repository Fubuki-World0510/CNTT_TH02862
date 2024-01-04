#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float dai;
	float rong;
	
	printf("Dai? ");
	scanf("%f",&dai);
	printf("Rong? ");
	scanf("%f",&rong);
	printf("Chu vi la: %f", (dai+rong)*2);
	printf("\nDien vi la: %f", dai*rong);
	return 0;
}
