//递归实现求第n个斐波那契数
#include<stdio.h>
int fib(int n)
{
	if (n == 0)
	{
		return 0;
	}
	else if (1==n|| n==2)
	{
		return 1;
	}
	else
	{
		return fib(n - 1) + fib(n - 2);
	}
}
int main()
{ 
	int a;
	scanf("%d", &a);
	fib(a);
	printf("%d\n", fib(a));
	return 0;
}
// 非递归实现求第n个斐波那契数
#include<stdio.h>
int fib(int n)
{
	int a = 1;
	int b = 1;
	int c = 0;
	if (n == 0)
	{
		return 0;
	}
	else if (n == 1 || n == 2)
	{
		return 1;
	}
	else
	{
		while(n > 2)
		{
			c=a+b;
			a = b;
			b = c;
			n--;
		}
		return c;
	}
}
 int main()
{ 
	int a;
	scanf("%d", &a);
	fib(a);
	printf("%d\n", fib(a));
	return 0;
//}