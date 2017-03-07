package janusxu_chn;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza creatPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Test"))
			return new NYStylePizza();
		else 
			return null;
	}

}
