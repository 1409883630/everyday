//不允许创建临时变量，交换两个整数的内容
#include <stdio.h>
int main()
{
	int a = 10;
	int b = 20;
	a = a^b;
	b = a^b;
	a = a^b;
	printf("a = %d  b = %d\n", a, b);
	return 0;
}