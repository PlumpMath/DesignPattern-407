
public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+",Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+0.30;
	}

}
