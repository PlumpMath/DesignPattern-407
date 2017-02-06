package Ducks;

import Fly.FlyWithRocket;
import Sound.SpeakSound;

public class RocketDuck extends Duck {

	public RocketDuck() {
		// TODO Auto-generated constructor stub
		this.flyway=new FlyWithRocket();
		this.makesound= new SpeakSound();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我是一只宇航鸭！！！");
	}
	
	public void swim(){
		System.out.println("我穿着宇航服，不能游泳。。");
	}

}
