//写代码将三个数按从大到小输出
#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
int main()
{
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	if (a<b)
	{
		int tmp = a;
		a = b;
		b = tmp;
	}
	if (a<c)
	{
		int tmp = a;
		a = c;
		c = tmp;
	}
	if (b<c)
	{
		int tmp = b;
		b = c;
		c = tmp;
	}
	printf("a=%d b=%d c=%d\n", a, b, c);
	return 0;
}
