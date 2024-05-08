#include <stdio.h>

int main(){
	int i;
	
	for(i = 50; i < 100; i++) {
	if(i%2) printf("%d\n", &i);
	else ;	
	}
}
