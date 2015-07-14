package qiuchao.puzzle.express;

public class LongDiv {

	public static void main(String[] args) {
		/*
		 * 越界
		 */
		long timeL=24*60*60*1000*1000;
		long timeS=24*60*60*1000;
		System.out.println("越界："+timeL/timeS);
		/*
		 * 正确使用方法
		 */
		long timeLL=24*60*60*1000*1000L;
		long timeSS=24*60*60*1000L;
		System.out.println("正确："+timeLL/timeSS);
	}

}
