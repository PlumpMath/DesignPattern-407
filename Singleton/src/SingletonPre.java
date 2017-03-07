
public class SingletonPre {
	//此方法线程安全但是一开始就创建对象，可能会在不需要对象时浪费性能
	private static SingletonPre uniqueInstance = new SingletonPre();
	
	private SingletonPre(){}
	
	public static SingletonPre getInstance(){
		return SingletonPre.getInstance();
	}
}
