package com.wip.training.types;
import com.wip.training.inheritance.Animal;

public class KittenProtected extends Animal {
	
	public static void main(String[] args) {
		KittenProtected kp = new KittenProtected();
		
		//even the protected method walking of Animal can be accessed by the subclass of different package
		kp.walking();
		kp.scream();
		
	}
	
}