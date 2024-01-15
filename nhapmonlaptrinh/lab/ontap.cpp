#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() {
	int option, nguyenduong, chanle, namsinh;
	float congtrunhanchia1, congtrunhanchia2, toan, ly, hoa, tong;
	printf("-------Menu-------\nOption 1: Check nguyen duong\nOption 2: Check chan-le\nOption 3: Tinh tong, hieu, tich, thuong\nOption 4: Tinh tuoi\nOption 5: Chuc nang 5\nOption 6: Thoat\n\nYour Option [1, 2, 3, 4, 5, 6]: ");
	scanf("%d", &option);
	
	switch(option) {
		case 1:
			printf("Nhap so (Duong/Am): ");
			scanf("%d", &nguyenduong);
			if(nguyenduong > 0) return printf("Duong nhe ban");
			if(nguyenduong < 0) return printf("Am roi ban");
			if(nguyenduong == 0) return printf("Wtf bro ????");
			break;
		case 2:
			printf("Nhap so (Chan/Le): ");
			scanf("%d", &chanle);
			if(chanle%2 == 0) return printf("Chan nhe ban");
			else return printf("Le nhe ban");
			break;
		case 3:
			printf("Nhap so thu nhat: ");
			scanf("%f", &congtrunhanchia1);
			printf("Nhap so thu hai: \n");
			scanf("%f", &congtrunhanchia2);
			printf("Tong: %1.f\n", congtrunhanchia1+congtrunhanchia2);
			printf("Hieu: %1.f\n", congtrunhanchia1-congtrunhanchia2);
			printf("Tich: %1.f\n", congtrunhanchia1*congtrunhanchia2);
			printf("Thuong: %1.f\n", congtrunhanchia1/congtrunhanchia2);
			break;
		case 4:
			printf("Nhap nam sinh cua ban: ");
			scanf("%d",&namsinh);
			printf("Tuoi cua ban la: %d", 2024-namsinh);
			break;
		case 5:
			printf("Toan -> ");
			scanf("%f",&toan);
			printf("Ly -> ");
			scanf("%f",&ly);
			printf("Hoa -> ");
			scanf("%f",&hoa);
			tong = (toan+ly+hoa)/3;
			printf("Check tong: %f", tong)
			if(tong >= 9) return printf("Xuat sac vai l ban");
			else if(tong >= 8) return printf("Gioi ban");
			else if(tong >= 6) return printf("Kha qua nhe");
			else if(tong >= 5) return printf("Trung binh ban?");
			else return printf("Ngu the ?");
			break;
		case 6:
			break;
		default:
			printf("sai me roi, ngu nhu con cho");
	}
}
