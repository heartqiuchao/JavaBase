package qiuchao.base2013;

public class Main {
	public String intToString(int id) {
		Integer integer=id;
		String str_id=integer.toString();
		System.out.println(str_id);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6-str_id.length(); i++) {
				System.out.println(str_id.length());
				sb.append(0);
		}
		sb.append(str_id);
		return sb.toString();
	}
	public static void main(String[] args) {
		Main m=new Main();
//		m.Test();
//		System.out.print(Main.b);
		int i=300008;
		System.out.println(m.intToString(i));
	}

}
