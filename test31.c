//求Sn = a + aa + aaa + aaaa + aaaaa的前5项之和，，其中a是一个数字，例如：2 + 22 + 222 + 2222 + 22222。
#include<stdio.h>
int main()
{
	int a = 0;
	int b = 0;
	int tmp = 0;
	int sum = 0;
	scanf("%d %d", &a, &b);
	for (int i = 1; i <= b; i++)
	{
		tmp = tmp * 10 + a;
		sum += tmp;
	}
	printf("%d\n", sum);
	return 0;
}
