package qiuchao.abstract_interface;

/**
 * 
 * @author Qiuchao 
 * 1，抽象类里可以有构造方法，而接口内不能有构造方法。
 * 2，抽象类中可以有普通成员变量，而接口中不能有普通成员变量。
 * 3，抽象类中可以包含非抽象的普通方法，而接口中所有的方法必须是抽象的，不能有非抽象的普通方法。
 * 4，抽象类中的抽象方法的访问类型可以是public，protected和默认类型，但接口中的抽象方法只能是public类型的，并且默认即为public abstract类型。
 * 5，抽象类中可以包含静态方法，接口内不能包含静态方法。
 * 6，抽象类和接口中都可以包含静态成员变量，抽象类中的静态成员变量的访问类型可以任意，但接口中定义的变量只能是public static类型，并且默认为public static类型。
 * 7，一个类可以实现多个接口，但只能继承一个抽象类。
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
