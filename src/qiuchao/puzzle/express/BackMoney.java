package qiuchao.puzzle.express;
/**
 * 
 * @author Qiuchao
 * 找零时刻
 * 注对于货币计算通常是非常不合适的，解决的问题是转化为整型
 */
public class BackMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i=2.00;
		double j=1.10;
		System.out.println(i-j);	//不精确
		System.out.printf("%.2f",i-j);	//想要的结果，但不一定
	}

}
