//求两个数二进制中不同位的个数
#include <stdio.h>
int com(int m, int n)
{
	int tmp = m^n;//利用符号位判断
	int count = 0;
	while (tmp)
	{
		tmp = tmp&(tmp - 1);
		count++;
	}
	return count;
}
int main()
{
	int m, n;
	while (scanf("%d %d", &m, &n) == 2)//可以循环判断
	{
		printf("%d\n", com(m, n));
	}
	return 0;
}