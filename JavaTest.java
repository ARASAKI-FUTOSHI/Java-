//package java_test_bteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaTest {
	
	
	int totalpoint;
	
	String msg;
	
	int ti; //回
	int qn; //大問
	String[][][] question;
	

	
	void setwrite() {
		
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
			sb.append(in.readLine());
		}catch(IOException e) {
			System.out.println("入出力の例外が発生しました");
			e.printStackTrace();
		}
		 msg = sb.toString();

	}
	String getwrite() {
		return msg;
	}
	int aaa() {
		System.out.println("何回に挑戦しますか");
			boolean test4 = false;
			do {
				try {
					
					System.out.println("42〜47のいずれかの数字を入力してください");
					setwrite();
					ti = Integer.parseInt(getwrite());
					
				} catch (NumberFormatException e) {

					test4 = false;
					continue;
				}
				test4 = true;
			} while (test4 == false || !(42 <= ti && 47 >= ti));
		return ti;
	}
}
