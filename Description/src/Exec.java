
public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage test=new Espresso();
		System.out.println(test.getDescription());
		
		test=new Mocha(test);
		System.out.println(test.getDescription());
		System.out.println(test.cost());
		
		test=new Whip(test);
		System.out.println(test.getDescription());
		System.out.println(test.cost());
		
		test=new Mocha(test);
		System.out.println(test.getDescription());
		System.out.println(test.cost());
	}

}
