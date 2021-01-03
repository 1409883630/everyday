//编写一个函数实现n的k次方，使用递归实现，
#include<stdio.h>
int sqrt(int n,int k)
{
	if (k ==  0)
	{
		return 1;
	}
	else if (k>=1)
	{
		return n*sqrt(n, k - 1);
	}
}
int main()
{
	int a,b;
	scanf("%d %d", &a, &b);
	printf("%d\n", sqrt(a, b));
	return 0;
}
