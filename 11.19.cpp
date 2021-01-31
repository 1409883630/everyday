// 比较两个数大小，输出大数，函数形式。。
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
	   printf("两个数一样大");
	}
}
int main()
{
	int a, b,z;
	printf("输入两个数：");
	scanf("%d %d", &a, &b);
	z = compare(a, b);
	printf("%d\n", z);
	return 0;
}
