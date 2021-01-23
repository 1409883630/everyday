//非递归求n的阶乘。
#include<stdio.h>
void add(int n)
{
	int ret = 1;
	for (int i = 2; i <= n; i++)
	{
		ret *= i;
	}
	printf("%d\n", ret);
}
int main()
{
	int a;
	scanf("%d", &a);
	add(a);
	return 0;
}
