//12*12乘法表（n*n)。
#include<stdio.h>
void add(int n)//构造一个函数
{
	for (int i = 1; i < n + 1; i++)//双重for循环打印
	{
		for (int j = 1; j <= i; j++)
		{
			printf("%d * %d = %2d ", j, i, i*j);
		}
		printf("\n");
	}
}
int main()
{
	int a;
	scanf("%d", &a);
	add(a);//调用
	return 0;
}
