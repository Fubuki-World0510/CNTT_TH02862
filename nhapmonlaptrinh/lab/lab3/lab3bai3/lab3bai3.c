#include <stdio.h>
#include <math.h>
int main()
{
	float sodien, sotien;
	const float muc1 = 1678;
	const float muc2 = 1734;
	const float muc3 = 2014;
	const float muc4 = 2536;
	const float muc5 = 2834;
	const float muc6 = 2927;
	printf("nhap vao so dien");
	scanf("%f", &sodien);
	if (sodien <= 50)
	{
		sotien = (muc1 * sodien);
	}
	else if (sodien <= 100)
	{
		sotien = (muc1 * 50 + muc2 * (sodien - 50));
	}
	else if (sodien <= 200)
	{
		sotien = (muc1 * 50 + muc2 * 50 + muc3 * (sodien - 100));
	}
	else if (sodien <= 300)
	{
		sotien = (muc1 * 50 + muc2 * 50 + muc3 * 50 + muc4 * (sodien - 100));
	}
	else if (sodien <= 400)
	{
		sotien = (muc1 * 50 + muc2 * 50 + muc3 * 50 + muc4 * 50 + muc5 * (sodien - 100));
	}
	else
	{
		sotien = (muc1 * 50 + muc2 * 50 + muc3 * 50 + muc4 * 50 + muc5 * 50 + muc6 * (sodien - 400));
	}
	return 0;
}