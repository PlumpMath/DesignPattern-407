
public class Singleton {
	//����д�ȿ��Ա�֤�̰߳�ȫ����ֻ�ڵ�һ��ͬ������ʡ������
	private volatile static Singleton uniqueInstance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(Singleton.uniqueInstance==null){
			synchronized (Singleton.class) {
				if(Singleton.uniqueInstance==null){
					return new Singleton();
				}
			}
		}
		return Singleton.uniqueInstance;
	}
}
