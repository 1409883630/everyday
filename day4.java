//�������ڵ�����ת��
import java.util.*;

public class Test {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();
        int Day=ss(year,month,day);
        System.out.println(Day);
    }
}
public static int ss(int year,int month,int day){
    //�������飬ÿ���µ�����
    int[]Day={31,28,31,30,31,30,31,31,30,31,30,31};
    //��������
    if(year%4==0&&year%100!=0||year%400==0){
        Day[1]=29;
    }
    //�ж�Լ������������Ҫ����
    if(year<=0||month<=0||month>12||day<=0||day>Day[month-1]){
        return -1;
    }
    int sum=0;
    for(int i=0;i<month-1;i++){
        sum+=Day[i];
    }
    //���sum��Ҫ���ϵ�ǰ�·ݵ�����
    return sum+day;
}
}