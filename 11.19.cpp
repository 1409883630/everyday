#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int compare(int x, int y)
{
	if (x > y)
	{
		return x;
	}
	else if (x<y)
	{
		return y;
	}
	else if (x=y)
	{
	   printf("������һ����");
	}
}
int main()
{
	int a, b,z;
	printf("������������");
	scanf("%d %d", &a, &b);
	z = compare(a, b);
	printf("%d\n", z);
	return 0;
}