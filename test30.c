//写一个函数返回参数二进制中 1 的个数
//比如： 15    0000 1111    4 个 1
#include<stdio.h>
void bit(int n)
{
	int count = 0;
	while (n)
	{
		if (n % 2 == 1)
			count++;
		n = n / 2;
	}
	printf("%d\n", count);
}
int main()
{
	int a;
	scanf("%d", &a);
	bit(a);
	return 0;
}
