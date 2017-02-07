package janusxu_chn;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare(){
		System.out.println("准备 "+this.name+" 中。。。");
		System.out.println("准备面团");
		System.out.println("加入酱料");
		System.out.println("添加调料：");
		for (String topping : this.toppings) {
			System.out.print(topping+" ");
		}
		System.out.println();
	}
	
	public void bake(){
		System.out.println("烘烤中。。。");
	}
	
	public void cut(){
		System.out.println("切块中。。。");
	}
	
	public void box(){
		System.out.println("装盒中。。。");
	}
	
	public String getName(){
		return this.name;
	}
}
