package Ducks;

import Fly.FlyNoWay;
import Sound.NoSound;

public class BigYellowDuck extends Duck {
	
	public BigYellowDuck(){
		this.flyway=new FlyNoWay();
		this.makesound=new NoSound();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("����һֻ���Ѽ������");
	}

}
