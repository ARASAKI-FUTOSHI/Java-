//package java_test_bteam;

public class Main {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("【Javaプログラミング能力検定過去問道場】");
		System.out.println("");
		JavaTest c = new JavaTest();

		int zi = 1;
		while (zi != 2) {
			int ti = c.aaa();
			if (ti == 42) {
				Q42 q42 = new Q42();
				q42.a(ti);

			} else if (ti == 43) {
				Q43 q43 = new Q43();
				q43.a(ti);
	

			} else if (ti == 44) {
				Q44 q44 = new Q44();
				q44.a(ti);
	

			}else if (ti == 45) {
				Q45 q45 = new Q45();
				q45.a(ti);
	

			}else if (ti == 46) {
				Q46 q46 = new Q46();
				q46.a(ti);
	

			}else if (ti == 47) {
				Q47 q47 = new Q47();
				q47.a(ti);
	

			}
			ViewSample3 vie3 = new ViewSample3(ti);
			vie3.setVisible(true);
			vie3.setAlwaysOnTop(true);
			
			boolean test = false;

			do {
				try {
					System.out.println("次の回をやりますか?");// 例外処理必要
					System.out.println("1:YES 2:NO");
					c.setwrite();
					zi = Integer.parseInt(c.getwrite());

				} catch (NumberFormatException e) {

					test = false;
					continue;

				}
				test = true;

			} while (test == false || !(zi >= 1 && zi <= 2));
			vie3.setVisible(false);
		}

		System.out.println("道場を終了します");
		System.out.println("お疲れさまでした！");
		System.exit(1);
	}

}
