#include <stdio.h>

int main() {
	int x;
	int i = 1;
	int c = 0;
	printf("So? ");
	scanf("%d", &x);
	for(i; i<x; i++) {
		if(i*i == x) printf("IS CHINH PHUONG");
	}
}
