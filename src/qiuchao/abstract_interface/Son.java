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
		//���ڲ�������
		AbstractA fatherA=new Son();
		fatherA.eat(0);
		//�ڲ�������
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
