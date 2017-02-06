package Ducks;

import Fly.FlyBehavior;
import Sound.MakeSoundBehavior;

public abstract class Duck {
	protected FlyBehavior flyway;
	protected MakeSoundBehavior makesound;
	
	public Duck(){};
	
	public abstract void display();
	
	public void fly(){
		flyway.fly();
	}
	
	public void quack(){
		makesound.MakeSound();
	}
	
	public void swim(){
		System.out.println("Œ“ª·”Œ”æ£°£°£°");
	}
}
