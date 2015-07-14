package qiuchao.abstract_interface;
/**
 * 
 * @author Qiuchao
 *精典的设计模式就出来了：声明类型的工作仍然由Java接口承担，但是同时给出一个Java 抽象类，且实现了这个接口，而其他同属于这个抽象类型的具体类可以选择实现这个Java接口，也可以选择继承这个抽象类，也就是说在层次结构中，Java 接口在最上面，然后紧跟着抽象类，这下两个的最大优点都能发挥到极至了。这个模式就是“缺省适配模式”。在Java语言API中用了这种模式，而且全都遵循一定的命名规范：Abstract ＋接口名。（A extends AbstractB implements interfaceC，那么A即可以选择实现(@Override)接口interfaceC中的方法，也可以选择不实现；A即可以选择实现(@Override)抽象类AbstractB中的方法，也可以选择不实现）
 */
public class TestMain extends AbstractA{
	
	@Override
	public void run(double speed) {
		// TODO Auto-generated method stub
		super.run(speed);
	}

	@Override
	public void fly(double speed) {
		// TODO Auto-generated method stub
		super.fly(speed);
	}

	@Override
	public void walk(double speed) {
		// TODO Auto-generated method stub
		super.walk(speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
