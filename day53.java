

// A，B，C三个人是好朋友，每个人手里都有一些糖果，我们不知道他们每个人手上具体有多少个糖果，但是我们知道以下的信息。。
// A-B，B-C，A + B，B +C。这四个数值。每个字母代表每个人所拥有的糖果数。
//现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。

//输入描述:
//输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 
//范围均在-30到30之间(闭区间)。

//输出描述:
//输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。 
//如果不存在这样的整数A，B，C，则输出No

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()) {
            int y1 = sca.nextInt();
            int y2 = sca.nextInt();
            int y3 = sca.nextInt();
            int y4 = sca.nextInt();


            int A = (y1 + y3) / 2;
            int B = (y2 + y4) / 2;
            int C = B - y2;
            if ((y1 + y3) % 2 == 0 && (y2 + y4) % 2 == 0 && (A+B) == y3) {
                System.out.println(A + " " + B + " " + C);
            } else {
                System.out.println("No");
            }
        }
    }
}
