package janusxu_chn;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare(){
		System.out.println("׼�� "+this.name+" �С�����");
		System.out.println("׼������");
		System.out.println("���뽴��");
		System.out.println("��ӵ��ϣ�");
		for (String topping : this.toppings) {
			System.out.print(topping+" ");
		}
		System.out.println();
	}
	
	public void bake(){
		System.out.println("�濾�С�����");
	}
	
	public void cut(){
		System.out.println("�п��С�����");
	}
	
	public void box(){
		System.out.println("װ���С�����");
	}
	
	public String getName(){
		return this.name;
	}
}
