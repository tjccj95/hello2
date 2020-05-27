package test.main;
import java.io.*;
public class exam02 {
	public static void main(String[] ar)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));;
		System.out.print("국어점수 : ");
		float kor = Float.parseFloat(in.readLine());  
		System.out.print("영어점수 : ");
		float eng = Float.parseFloat(in.readLine()); 
		System.out.print("수학점수 : ");
		float math = Float.parseFloat(in.readLine()); 
		
		float avg = (kor+eng+math)/3f;
		System.out.println("평균점수 : " + avg);
	}
}
