package qiuchao.puzzle.express;

public class Object_String {

	public static void main(String[] args) {
		Object x=3;
		int y=5;
		y+=(int)x;
		System.out.println(y);
		
		x=(int)x+y;
		System.out.println(x);
		
		char[] c={'1','2','3'};
		System.out.println(c);
		
		System.out.println(c+"OK");	//ยาย๋
		/*
		 * wrong
		 */
//		x+=y;
	
	}

}
