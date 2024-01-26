#include <stdio.h>


int sole(int sole) {
    int tong;
    int i;
    for (i = 1; i < sole; i++) {
        if(i%2) {
            tong = i * sole;
        }
    }
    return tong;
}

int main() {

    printf("%d", sole(10));
    return 0;
}