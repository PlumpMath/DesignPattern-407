
public class SingletonSimple {
	private static SingletonSimple uniqueInstance;
	
	private SingletonSimple(){}
	
	public static synchronized SingletonSimple getintstance() {
		// TODO Auto-generated method stub
		//�߳�ͬ��synchronized����������ڶ���߳�ͬʱ����
		//����ͬ���߳̽�������
		if(SingletonSimple.uniqueInstance==null){
			return new SingletonSimple();
		}
		return SingletonSimple.uniqueInstance;
	}
}
