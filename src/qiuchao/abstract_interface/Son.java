package qiuchao.abstract_interface;

public class Son extends AbstractA{
	
	@Override
	public void run(double speed) {
		System.out.println("I'm son, I can run");	
	}

	@Override
	public void fly(double speed) {
		System.out.println("I'm son, I can fly");
	}

	@Override
	public void walk(double speed) {
		System.out.println("I'm son, I can walk");
	}

	@Override
	void eat(double speed) {
		System.out.println("I'm son, I can eat");
	}

	public static void main(String[] args) {
		//非内部匿名类
		AbstractA fatherA=new Son();
		fatherA.eat(0);
		//内部匿名类
		AbstractA faA=new AbstractA() {

			@Override
			void eat(double speed) {
				// TODO Auto-generated method stub
				super.eat(speed);
			}
			
		};
		faA.eat(0);
	}

}
