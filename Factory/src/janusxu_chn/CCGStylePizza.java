package janusxu_chn;

public class CCGStylePizza extends Pizza {
	public CCGStylePizza() {
		// TODO Auto-generated constructor stub
		this.name="芝加哥披萨";
		this.dough="厚饼";
		this.sauce="小番茄酱";
		this.toppings.add("意大利白干酪");
	} 
	
	public void cut(){
		System.out.println("切成方形。。。");
	}
}
