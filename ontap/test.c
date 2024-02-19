#include <stdio.h>

int main() {
	int i;
	
	for(i = 1; i < 101; i++) {
		if(i%2) printf("So le:\n %d\n----------------------", i);
	}
	for(i = 1; i < 51; i++) {
		if(i%2) {
		}
		else printf("So chan:\n %d\n----------------------", i);
	}
	for(i = 1; i < 51; i++) {
		printf("So 1-50:\n %d\n----------------------", i);
	}
	return 0;
}


/*
	- Vong lap dung de lap di lap lai cong viec nao do
	- 3 Vong lap:
	+ for
	+ while
	+ do..while
*/
