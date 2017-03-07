
public class Singleton {
	//这样写既可以保证线程安全，又只在第一次同步，节省了性能
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
