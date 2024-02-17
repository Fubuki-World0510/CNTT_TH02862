#include<stdio.h>
int main()
{
   	int n;
	int biendem=0;
	int max,min;
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
		printf("\t%d",a[i]);
	}
	for(i=0;i<n;i++){
		if(a[i]>max)
		max=a[i];
	}
	printf("\nGia tri lon nhat la: %d",max);
	{
	for(i=0;i<n;i++){
		if(a[i]<min)
		min=a[i];
	}
	printf("\ngia tri nho nhat la: %d",min);
	}
	
    return 0;
}