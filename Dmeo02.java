
//�û�������������������㹲���켸ʱ���ּ��뼸���롣 
import java.util.Scanner;
public class Dmeo02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������������");
		int ms=sc.nextInt();
		int days=ms/(1000*60*60*24);
		int hours=ms%(1000*60*60*24)/(1000*60*60);
		int mins=ms%(1000*60*60)/(1000*60);
		int sends=ms%(1000*60)/1000;
		int mss=ms%1000;
		System.out.println(days+"��"+hours+"ʱ"+mins+"��"+sends+"��"+mss);
		sc.close();
	}

}
