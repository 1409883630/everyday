//该程序让用户输入圆的半径Radius，输出圆的周长Perimeter和面积/
//Ex1_02.CPP
#include <iostream>
#include <cmath>
using namespace std;
const double PI = 3.14159;	//定义一个常量PI  #define PI 3.14159
int main()
{
	int radius;
	double perimeter, area;
	cout << "请输入半径: ";
	cin >> radius;
	perimeter = 2 * PI * radius;					//周长=2πR
	area = PI * pow(radius, 2);					//面积=πR2
	cout << "周长是 : " << perimeter << endl;
	cout << "面积是 : " << area << endl;
	return 0;
}
