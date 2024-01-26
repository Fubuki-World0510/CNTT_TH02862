#include <stdio.h>


int ham(int so1, int so2, int so3) {
    if(so1 < so2) {
        if(so2 < so3) {
            if(so3 > so1) {
                return 3;
            }
        } else if(so2 > so3) {
            return 2;
        }
    } else if(so1 < so2) {
        
    }
}

int main() {
    return 0;

}