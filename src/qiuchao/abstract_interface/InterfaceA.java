package qiuchao.abstract_interface;
/**
 * 
 * @author Qiuchao
 * 1.接口中的方法定义默认为public  abstract
 * 2.接口中的变量是全局常量，即public static final修饰的
 */
public interface InterfaceA extends InterfaceB,InterfaceC{
	int add=10;
	/**
	 * walkAction
	 */
	void walk(double speed);
	
}
