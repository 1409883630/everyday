//实现一个函数，判断一个数是不是素数。利用上面实现的函数打印100到200之间的素数。
#include<stdio.h>
void  prime(int x)//构建判断素数的函数
{
	int i = 2;
	for (i = 2; i < x; i++)
	{
		if (x%i == 0) //利用模除判断素数
		{
			break;
		}
	}
	if (i < x)
	{
		1;
	}
	else 
	{
		printf("%d ", x);
	}
}
int main()//主函数调用素数函数
	{
	int a = 100;
	for (a = 100; a <= 200; a++)
	{
		prime(a);
	}
	printf("\n");
	return 0;
	}
