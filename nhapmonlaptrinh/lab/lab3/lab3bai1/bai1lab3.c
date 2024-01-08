#include <stdio.h>

int main() {
	float x;
	
	printf("Nhap diem ngay: ");
	scanf("%f",&x);
	
	printf("INPUT: %f\n", x);
	if(x >= 9) return printf("Diem %.f nay Xuat sac vl", x);
	else if(x >= 8) return printf("Diem %.f nay Gioi vl", x);
	else if(x >= 6.5) return printf("Diem %.f Kha day", x);
	else if(x >= 5) return printf("Diem %.f nay Trung binh ban oiiii", x);
	else if(x >= 3.5) return printf("Yeu the ban ?");
	else return printf("Ngu the ban ?");
}
