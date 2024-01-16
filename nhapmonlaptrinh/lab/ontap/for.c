#include <stdio.h>

//While==============================
//int main(){
//	int i = 0;
//	while(i < 20) {
//	i++;
//	printf("%d. Toi bi ????\n", i);
//	}
//}

int main() {
	int i = 7;
	int tong = 0;
	while(i < 21) {
		if(i%2) printf(" ");
		else tong = tong + i;
		i++;
	} printf("%d\n", tong);
}
