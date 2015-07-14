package qiuchao.puzzle.express;

public class Short_Int {

	public static void main(String[] args) {
		short x=0,y=0;
		int i=123456;
		int j=123;
//		x=x+i;	//报错
		x+=i;	//不报错，内部自动将int转为short,但是越界了，自动截取高位，结果错误
		System.out.println(x);
		y+=j;	//不报错，结果正确，不越界
		System.out.println(y);
	}

}
