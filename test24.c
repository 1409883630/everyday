//��дһ������ reverse_string(char * string)���ݹ�ʵ�֣��������ַ����е��ַ��������С�����ʹ��C�������е��ַ�����������
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