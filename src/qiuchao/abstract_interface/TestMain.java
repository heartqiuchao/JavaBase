package qiuchao.abstract_interface;
/**
 * 
 * @author Qiuchao
 *��������ģʽ�ͳ����ˣ��������͵Ĺ�����Ȼ��Java�ӿڳе�������ͬʱ����һ��Java �����࣬��ʵ��������ӿڣ�������ͬ��������������͵ľ��������ѡ��ʵ�����Java�ӿڣ�Ҳ����ѡ��̳���������࣬Ҳ����˵�ڲ�νṹ�У�Java �ӿ��������棬Ȼ������ų����࣬��������������ŵ㶼�ܷ��ӵ������ˡ����ģʽ���ǡ�ȱʡ����ģʽ������Java����API����������ģʽ������ȫ����ѭһ���������淶��Abstract ���ӿ�������A extends AbstractB implements interfaceC����ôA������ѡ��ʵ��(@Override)�ӿ�interfaceC�еķ�����Ҳ����ѡ��ʵ�֣�A������ѡ��ʵ��(@Override)������AbstractB�еķ�����Ҳ����ѡ��ʵ�֣�
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
