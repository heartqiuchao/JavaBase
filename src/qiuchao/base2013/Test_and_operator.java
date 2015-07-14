package qiuchao.base2013;

public class Test_and_operator {

	public static void main(String[] args) {
		/*均可作为逻辑与(and)运算*/
		int a=1;
		int b=0;
		if(a==1&b==1){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		/*&&具有短路功能*/
		int x=30;
		int y=0;
		//&&  y不会增加
		if(x==33&&++y>0){
			System.out.println("OK"+"\ny:"+y);
		}else {
			System.out.println("Not OK"+"\ny:"+y);
		}
		//& y会增加
		if(x==33&++y>0){
			System.out.println("OK"+"\ny:"+y);
		}else {
			System.out.println("Not OK"+"\ny:"+y);
		}
		
		/*&可以作为位运算符*/
		int m=5;
		int n=-7;
		System.out.println(m&n);
	}

}
