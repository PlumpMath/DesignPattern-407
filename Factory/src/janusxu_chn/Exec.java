package janusxu_chn;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore store=new NYPizzaStore();
		
		Pizza pizza=store.orderPizza("Test");
		System.out.println(pizza.getName());
		
		store = new CCGPizzaStore();
		pizza=store.orderPizza("Test");
		System.out.println(pizza.getName());
		}

}
