#include <stdio.h>

int main(){
    int n;
    int biendem;
    int tong;
    printf("Nhap so o day: ");
    scanf("%d",&n);
    int a[n],i;
    for(i=0;i<n;i++)
    {
        printf("a[%d]",i);
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        printf("\t %d",a[i]);
    }
    for(i=0;i<n;i++)
    {
        if(a[i]%3==0)
        {
            tong=tong+a[i];
            biendem=0;
        }
    }
    printf("Trung binh tong cac so chia het cho 3: %f",(float)tong/biendem);

    return 0;
}