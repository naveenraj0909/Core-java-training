package com.day4;

class fruits{
	
	void taste()
	{
		System.out.println("It is sweet");
	}
	void colour() {
		System.out.println("All colour");
	}
}
class orange extends fruits{
	void colour() {
		System.out.println("colour is orange");
	}
}

class apple extends fruits {
	void colour() {
		System.out.println("colour is Red");
	}
}
public class dmd {

	public static void main(String[] args) {
		//non overriden -reference
		fruits obj = new orange();
		obj.taste();
		obj.colour();
		obj = new apple();
		obj.taste();
		obj.colour();

	}

}
