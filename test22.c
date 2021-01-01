//递归实现strlen strlen的含义是：求字符串中有效字符的长度，不包括\0，
#include<stdio.h>
#include<string.h>
int sstrlen(const char*str)
{
	if ( *str == '\0')
	{
		return 0;
	}
	else
	{
		return 1 + sstrlen(str + 1);
	}
}
int main()
{
	char a[] =  "hello world";
	printf("%d\n", sstrlen(a));
	return 0;
}
//非递归实现strlen  strlen的含义是：求字符串中有效字符的长度，不包括\0。
#include<stdio.h>
#include<string.h>
int count = 0;
void  sstrlen(char* str)
{

	while (*str != '\0')
	{
		count++;

		str++;
	}
}
int main()
{
	char a[] = "hello world";
	sstrlen(a);
	printf("%d\n", count);
	return 0;
}
