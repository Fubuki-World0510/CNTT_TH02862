#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int sodien;
	printf("nhap so dien: ");
	scanf("%d", &sodien);
	const float muc1 = 1678, muc2 = 1734, muc3 = 2014, muc4 = 2536, muc5 = 2834, muc6 = 2927;
	float sotien;
	if (sodien <= 50)
	{
		sotien = sodien * muc1;
	}
	else if (sodien <= 100)
	{
		sotien = 50 * muc1 + (sodien - 50) * muc2;
	}
	else if (sodien <= 200)
	{
		sotien = 50 * muc1 + muc2 * 50 + (sodien - 100) * muc3;
	}
	else if (sodien <= 300)
	{
		sotien = 50 * (muc1 + muc2) + 100 * muc3 + (sodien - 100) * muc4;
	}
	else if (sodien <= 400)
	{
		sotien = 50 * (muc1 + muc2) + muc3 * 100 + muc4 * 100 + (sodien - 100) * muc5;
	}
	else if (sodien >= 401)
	{
		sotien = 50 * (muc1 + muc2) + (muc3 + muc4 + muc5) * 100 + (sodien - 100) * muc6;
	}
	printf("so tien dien la: %f", sotien);

	return 0;
}