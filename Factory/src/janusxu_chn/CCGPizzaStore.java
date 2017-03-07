package janusxu_chn;

public class CCGPizzaStore extends PizzaStore {

	@Override
	protected Pizza creatPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Test"))
			return new CCGStylePizza();
		else
			return null;
	}

}
