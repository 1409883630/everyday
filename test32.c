//���������������в�ͬλ�ĸ���
#include <stdio.h>
int com(int m, int n)
{
	int tmp = m^n;//���÷���λ�ж�
	int count = 0;
	while (tmp)
	{
		tmp = tmp&(tmp - 1);
		count++;
	}
	return count;
}
int main()
{
	int m, n;
	while (scanf("%d %d", &m, &n) == 2)//����ѭ���ж�
	{
		printf("%d\n", com(m, n));
	}
	return 0;
}