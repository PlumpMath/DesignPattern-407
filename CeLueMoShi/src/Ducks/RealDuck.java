package Ducks;

import Fly.FlyWithWings;
import Sound.DuckSound;

public class RealDuck extends Duck {

	public RealDuck() {
		// TODO Auto-generated constructor stub
		this.flyway=new FlyWithWings();
		this.makesound=new DuckSound();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我是一只真鸭子！！！");
	}

}
