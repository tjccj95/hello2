package test.main;
import java.io.*;
public class MainClass07 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("main 메서드가 시작 되었습니다.");
		//지역변수를 만들고 값을 나중에 넣고 싶으면 초기값을 대입하는것이 좋다.
		int num1=0;
		//참조 데이터 type이 들어갈 빈 변수는 null을 대입해서 만든다.
		String name1=null;
		
		//boolean의 초기값은 false이다.
		System.out.println("main 메서드가 종료됩니다.");
	}

}
