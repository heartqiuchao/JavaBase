package qiuchao.puzzle.express;

public class Short_Int {

	public static void main(String[] args) {
		short x=0,y=0;
		int i=123456;
		int j=123;
//		x=x+i;	//����
		x+=i;	//�������ڲ��Զ���intתΪshort,����Խ���ˣ��Զ���ȡ��λ���������
		System.out.println(x);
		y+=j;	//�����������ȷ����Խ��
		System.out.println(y);
	}

}
