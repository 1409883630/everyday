//����һ������ÿλ֮�ͣ��ݹ�ʵ�֣�
#include<stdio.h>
void  DigitSum(int n)
{
	int sum = 0;
	if (n < 10)
	{
		printf("%d", n);
		sum += n;
	}
	else
	{
		DigitSum(n / 10);

	}
	printf("%d\n", sum);
}
int main()
{
	int a;
	scanf("%d", &a);
	DigitSum(a);
	return 0;
}
