//编写一个函数 reverse_string(char * string)（递归实现）将参数字符串中的字符反向排列。不能使用C函数库中的字符串操作函数
#include<stdio.h>
#include<string.h>
void reverse_string(char * arr)
{
	   int len = strlen(arr);
       char tmp = *arr;
       *arr = *(arr + len - 1);
       *(arr + len - 1) = '\0';
       if (strlen(arr + 1) >= 2)
       reverse_string(arr + 1);
       *(arr + len - 1) = tmp;
	}		
int main()
{
	char a[] = "hello world";
	reverse_string(a);
	printf("%s\n", a);
	return 0;
}