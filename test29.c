//求出0～n之间的所有“水仙花数”并输出
#include<stdio.h>
#include<math.h>
int main()
{
	int n = 0;
	scanf("%d", &n);
	for (int i = 0; i <= n; i++)
	{
		int a = 1;
		int c = i;

		while (c>9)//判断位数
		{
			c /= 10;
			a++;
		}
		int m = i;
		int b = 0;
		while (m)//判断是不是水仙花数
		{
			b += pow(double(m % 10), a);
			m /= 10;
		}
		if (i == b)//打印水仙花数
		{
			printf("%d ", i);
		}
	}
	printf("\n");
	return 0;
}
