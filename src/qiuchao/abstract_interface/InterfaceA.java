package qiuchao.abstract_interface;
/**
 * 
 * @author Qiuchao
 * 1.�ӿ��еķ�������Ĭ��Ϊpublic  abstract
 * 2.�ӿ��еı�����ȫ�ֳ�������public static final���ε�
 */
public interface InterfaceA extends InterfaceB,InterfaceC{
	int add=10;
	/**
	 * walkAction
	 */
	void walk(double speed);
	
}
