
public class SingletonPre {
	//�˷����̰߳�ȫ����һ��ʼ�ʹ������󣬿��ܻ��ڲ���Ҫ����ʱ�˷�����
	private static SingletonPre uniqueInstance = new SingletonPre();
	
	private SingletonPre(){}
	
	public static SingletonPre getInstance(){
		return SingletonPre.getInstance();
	}
}
