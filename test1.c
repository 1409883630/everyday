//打印1-100之间所有3的倍数的数字
#include<stdio.h>
int main()
{
	int i = 1;
	for (i = 1; i <= 100; i++)
	{
		if (i % 3 == 0)
			printf("%d\n", i);
	}
	return 0;
}
