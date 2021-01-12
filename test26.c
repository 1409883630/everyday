//递归实现1+2+..+n
#include<stdio.h>
int add(int n)
{
	if (n == 1)
	{
		return 1;
	}
	return n + add(n - 1);
}
int main()
{
	int a;
	scanf("%d", &a);
	printf("%d\n", add(a));
		return 0;
}
