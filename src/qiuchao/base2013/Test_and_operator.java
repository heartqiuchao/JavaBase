package qiuchao.base2013;

public class Test_and_operator {

	public static void main(String[] args) {
		/*������Ϊ�߼���(and)����*/
		int a=1;
		int b=0;
		if(a==1&b==1){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		/*&&���ж�·����*/
		int x=30;
		int y=0;
		//&&  y��������
		if(x==33&&++y>0){
			System.out.println("OK"+"\ny:"+y);
		}else {
			System.out.println("Not OK"+"\ny:"+y);
		}
		//& y������
		if(x==33&++y>0){
			System.out.println("OK"+"\ny:"+y);
		}else {
			System.out.println("Not OK"+"\ny:"+y);
		}
		
		/*&������Ϊλ�����*/
		int m=5;
		int n=-7;
		System.out.println(m&n);
	}

}
