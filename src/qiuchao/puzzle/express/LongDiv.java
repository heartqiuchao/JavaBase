package qiuchao.puzzle.express;

public class LongDiv {

	public static void main(String[] args) {
		/*
		 * Խ��
		 */
		long timeL=24*60*60*1000*1000;
		long timeS=24*60*60*1000;
		System.out.println("Խ�磺"+timeL/timeS);
		/*
		 * ��ȷʹ�÷���
		 */
		long timeLL=24*60*60*1000*1000L;
		long timeSS=24*60*60*1000L;
		System.out.println("��ȷ��"+timeLL/timeSS);
	}

}
