package qiuchao.puzzle.express;

public class JudgeOdd {
	/*
	 * wrong method 1
	 */
	public boolean isOdd_1(int i){
		return i/2==1;
	}
	
	/*
	 * right method 2
	 */
	public boolean isOdd_2(int i){
		return i/2!=0;
	}
	
	/*
	 * right method 3
	 */
	public boolean isOdd_3(int i){
		return (i&1)==1;
	}
	
	/*
	 * right method 4
	 */
	public boolean isOdd_4(int i){
		return (i&1)!=0;
	}
	
	public static void main(String[] args) {
		int i=-23;
		JudgeOdd jo=new JudgeOdd();
		System.out.println("Odd_1 answer:"+jo.isOdd_1(i));
		System.out.println("Odd_2 answer:"+jo.isOdd_2(i));
		System.out.println("Odd_3 answer:"+jo.isOdd_3(i));
		System.out.println("Odd_4 answer:"+jo.isOdd_4(i));
	}

}
