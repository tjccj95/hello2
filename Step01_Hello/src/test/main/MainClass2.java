package test.main;
import java.io.*;
public class MainClass2 {
	//run 했을때 실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		System.out.print("이름 : ");
		name=in.readLine();
		System.out.println("당신의 이름은 " + name + "입니다.");
		int a = 1;
		int b = 2;
		System.out.println("main 메소드가 시작되었습니다.");
		System.out.println("하나");
		System.out.println("두울");
		System.out.println("main 메소드가 리턴(종료) 됩니다.");
		System.out.println("a+b =" + (a + b));
		
	}
}
