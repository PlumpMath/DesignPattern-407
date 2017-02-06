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
		System.out.println("����һֻ�Ѽ������");
	}
	
	public void swim(){
		System.out.println("�Ҵ��������������Ӿ����");
	}

}
