//打印1000年到2000年之间的闰年
#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int i = 1000;
	for (i = 1000; i <= 2000; i++)
	{
		if (i % 4 == 0 && i % 100 != 0)
			printf("%d\n", i);
	}
	return 0;
}