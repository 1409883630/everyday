//�ó������û�����Բ�İ뾶Radius�����Բ���ܳ�Perimeter�����Area
//Ex1_02.CPP
#include <iostream>
#include <cmath>
using namespace std;
const double PI = 3.14159;	//����һ������PI  #define PI 3.14159
int main()
{
	int radius;
	double perimeter, area;
	cout << "������뾶: ";
	cin >> radius;
	perimeter = 2 * PI * radius;					//�ܳ�=2��R
	area = PI * pow(radius, 2);					//���=��R2
	cout << "�ܳ��� : " << perimeter << endl;
	cout << "����� : " << area << endl;
	return 0;
}