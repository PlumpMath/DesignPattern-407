package exec;

import Ducks.BigYellowDuck;
import Ducks.Duck;
import Ducks.RealDuck;
import Ducks.RocketDuck;
import Ducks.TinyToyDuck;

public class exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck RealDuck = new RealDuck();
		Duck ToyDuck=new TinyToyDuck();
		Duck RocketDuck=new RocketDuck();
		Duck BigDuck=new BigYellowDuck();
		
		Duck duckptr=RealDuck;
		duckptr.display();
		duckptr.fly();
		duckptr.quack();
		duckptr.swim();
		System.out.println();
		
		duckptr=ToyDuck;
		duckptr.display();
		duckptr.fly();
		duckptr.quack();
		duckptr.swim();
		System.out.println();
		
		duckptr=RocketDuck;
		duckptr.display();
		duckptr.fly();
		duckptr.quack();
		duckptr.swim();
		System.out.println();
		
		duckptr=BigDuck;
		duckptr.display();
		duckptr.fly();
		duckptr.quack();
		duckptr.swim();
	}

}
