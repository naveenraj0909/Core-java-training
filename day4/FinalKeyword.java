package com.day4;

class Accessmodifier{
	
	
	final int a = 10;
}
class Access extends Accessmodifier{
	
}
public class FinalKeyword {

	private static int a;

	public static void main(String[] args) {
		Accessmodifier obj = new Accessmodifier();
		System.out.println(obj.a);
		
		Access obj1 = new Access();
		System.out.println(obj1.a);

	}

}
