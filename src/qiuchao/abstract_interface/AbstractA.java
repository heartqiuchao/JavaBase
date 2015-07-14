package qiuchao.abstract_interface;

/**
 * 
 * @author Qiuchao 
 * 1��������������й��췽�������ӿ��ڲ����й��췽����
 * 2���������п�������ͨ��Ա���������ӿ��в�������ͨ��Ա������
 * 3���������п��԰����ǳ������ͨ���������ӿ������еķ��������ǳ���ģ������зǳ������ͨ������
 * 4���������еĳ��󷽷��ķ������Ϳ�����public��protected��Ĭ�����ͣ����ӿ��еĳ��󷽷�ֻ����public���͵ģ�����Ĭ�ϼ�Ϊpublic abstract���͡�
 * 5���������п��԰�����̬�������ӿ��ڲ��ܰ�����̬������
 * 6��������ͽӿ��ж����԰�����̬��Ա�������������еľ�̬��Ա�����ķ������Ϳ������⣬���ӿ��ж���ı���ֻ����public static���ͣ�����Ĭ��Ϊpublic static���͡�
 * 7��һ�������ʵ�ֶ���ӿڣ���ֻ�ܼ̳�һ�������ࡣ
 *
 */
public abstract class AbstractA extends AbstractB implements InterfaceA{
	
	@Override
	public void run(double speed) {
		System.out.println("I'm father, I can run");		
	}

	@Override
	public void fly(double speed) {
		System.out.println("I'm father, I can fly");
	}

	@Override
	public void walk(double speed) {
		System.out.println("I'm father, I can walk");
	}

	@Override
	void eat(double speed) {
		System.out.println("I'm father, I can eat");
	}
}
