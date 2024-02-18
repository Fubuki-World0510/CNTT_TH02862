#include <stdio.h>

int main() {
	int x;
	int i = 2;
	int c = 0;
	printf("Nhap so: ");
	scanf("%d", &x);
	
	while(i < x) {
	for(i = 2; i < x; i++) {
		if(x%i == 0) {
		c++;
	  }
	}
  }
	if(c == 0) return printf("SO NGUYEN TO");
	else return printf("ISN'T SO NGUYEN TO");
}