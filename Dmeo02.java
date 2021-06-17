
//用户输入任意毫秒数，计算共几天几时几分几秒几毫秒
import java.util.Scanner;
public class Dmeo02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入毫秒数：");
		int ms=sc.nextInt();
		int days=ms/(1000*60*60*24);
		int hours=ms%(1000*60*60*24)/(1000*60*60);
		int mins=ms%(1000*60*60)/(1000*60);
		int sends=ms%(1000*60)/1000;
		int mss=ms%1000;
		System.out.println(days+"天"+hours+"时"+mins+"分"+sends+"秒"+mss);
		sc.close();
	}

}
