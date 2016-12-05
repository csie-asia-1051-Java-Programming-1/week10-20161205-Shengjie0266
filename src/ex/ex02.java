package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021040 洪聖傑
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入度數:");
		int deg =scn.nextInt();
		float s=0,f=0;
		if(deg<=120){
			s=deg*2.1f;
			f=deg*2.1f;
			System.out.println("夏月:"+s);
			System.out.println("非夏月:"+f);
		}else if(deg>120 && deg<=330){
			s=(120*2.1f)+((deg-120)*3.02f);
			f=(120*2.1f)+((deg-120)*2.68f);
			System.out.println("夏月:"+s);
			System.out.println("非夏月:"+f);
		}else if(deg>330 && deg<=500){
			s=(120*2.1f)+((330-120)*3.02f)+((deg-330)*4.39f);
			f=(120*2.1f)+((330-120)*2.68f)+((deg-330)*3.61f);
			System.out.println("夏月:"+s);
			System.out.println("非夏月:"+f);
		}else if(deg>500 && deg<=700){
			s=(120*2.1f)+((330-120)*3.02f)+((500-330)*4.39f)+((deg-500)*4.97f);
			f=(120*2.1f)+((330-120)*2.68f)+((500-330)*3.61f)+((deg-500)*4.01f);
			System.out.println("夏月:"+s);
			System.out.println("非夏月:"+f);
		}else if(deg>700){
			s=(120*2.1f)+((330-120)*3.02f)+((500-330)*4.39f)+((700-500)*4.97f)+((deg-700)*5.63f);
			f=(120*2.1f)+((330-120)*2.68f)+((500-330)*3.61f)+((700-500)*4.01f)+((deg-700)*4.5f);
			System.out.println("夏月:"+s);
			System.out.println("非夏月:"+f);
		}
	}

}
