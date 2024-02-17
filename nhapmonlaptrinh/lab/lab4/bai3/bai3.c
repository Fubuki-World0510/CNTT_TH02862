#include <stdio.h>

int main()
{
	int x;
	int count = 0;
	printf("nhap x : ");
	scanf("%d", &x);
	for (int i = 1; i < x; i++)
	{
		if (i * i == x)
		{
			count++;
		}
	}
	if (count == 0)
	{
		printf("khong la so chinh phuong");
	}
	else
	{
		printf("la so chinh phuong");
	}
	return 0;
}