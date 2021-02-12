//求数组里10个整数中的最大值。
#include<stdio.h>
int main()
{
	int a[] = { 1, 0, 6, 5, 8, 7, 9, 3, 2, 4 };
	int sum = a[0];
	for (int i = 1; i <= 9; i++)
	{
		if (sum <= a[i])
		{
			sum = a[i];
		}
		else if (sum>a[i])
		{
			sum = sum;
		}
	}
	printf("%d\n", sum);
	return 0;
}
