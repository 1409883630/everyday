//计算一个数的每位之和（递归）。
#include<stdio.h>
int  DigitSum(int n)
{
	int sum = 0;
	if (n < 10)
	{
		return n;
	}
	else
	{
		return sum = n % 10 + DigitSum(n / 10);
	}
}
int main()
{
	int a;
	scanf("%d", &a);
	DigitSum(a);
	printf("%d\n", DigitSum(a));
	return 0;
}
