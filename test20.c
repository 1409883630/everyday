//递归求n的阶乘，，
#include<stdio.h>
int ret=1;
int add(int n)
{	
	if (n >= 2)
	{
		ret *= n;
		return add(n - 1);
	}	  
}
int main()
{
	int a;
	scanf("%d", &a);
	add(a);
	printf("%d\n", ret);
	return 0;
}
