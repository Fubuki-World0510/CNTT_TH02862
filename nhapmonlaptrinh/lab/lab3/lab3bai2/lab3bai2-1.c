#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	float em, toi;
	
	printf("Nhap so a vao di em: ");
	scanf("%f",&em);
	printf("Nhap so b vao di em: ");
	scanf("%f",&toi);
	
	printf("OUTPUT: %f va %f\n", em, toi);
	if(em == 0) {
		if(toi == 0) return printf("Vo so nghiem");	
		else return printf("Vo nghiem roi ban");
	} else {
		printf("Ket qua cua %1.fx+%1.f=0 la %1.f", em, toi, -toi/em);
	};
}
