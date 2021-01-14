//给定两个数，求这两个数的最大公约数。
#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int a;
	int b;
	int c;
	scanf("%d %d", &a, &b);
	while (c = a%b)
	{
		a = b;
		b = c;
	}
	printf("%d\n", b);
	return 0;
}
