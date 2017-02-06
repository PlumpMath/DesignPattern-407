package Ducks;

import Fly.FlyNoWay;
import Sound.ToySound;

public class TinyToyDuck extends Duck {

	public TinyToyDuck() {
		// TODO Auto-generated constructor stub
		this.flyway=new FlyNoWay();
		this.makesound=new ToySound();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我是一只玩具鸭。。");
	}

}
