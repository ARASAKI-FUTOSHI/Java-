//package java_test_bteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaTest {
	
	
	int totalpoint;
	
	String msg;
	
	int ti; //‰ñ
	int qn; //‘å–â
	String[][][] question;
	

	
	void setwrite() {
		
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
			sb.append(in.readLine());
		}catch(IOException e) {
			System.out.println("“üo—Í‚Ì—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
			e.printStackTrace();
		}
		 msg = sb.toString();

	}
	String getwrite() {
		return msg;
	}
	int aaa() {
		System.out.println("‰½‰ñ‚É’§í‚µ‚Ü‚·‚©");
			boolean test4 = false;
			do {
				try {
					
					System.out.println("42`47‚Ì‚¢‚¸‚ê‚©‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
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
