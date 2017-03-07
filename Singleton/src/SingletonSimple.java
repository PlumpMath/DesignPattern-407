
public class SingletonSimple {
	private static SingletonSimple uniqueInstance;
	
	private SingletonSimple(){}
	
	public static synchronized SingletonSimple getintstance() {
		// TODO Auto-generated method stub
		//线程同步synchronized，否则可能在多个线程同时创建
		//但是同步线程降低性能
		if(SingletonSimple.uniqueInstance==null){
			return new SingletonSimple();
		}
		return SingletonSimple.uniqueInstance;
	}
}
