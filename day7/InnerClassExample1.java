package com.day7;

interface Inner4 {
	void display();
}

public class InnerClassExample1 {

	class Inner1 {
		void display() {
			System.out.println("Non-Static Inner Class");
		}
	}

	static class Inner2 {
		void display() {
			System.out.println("Static Inner Class");
		}
	}

	public static void main(String[] args) {
		InnerClassExample1 obj = new InnerClassExample1();
		Inner1 inner = obj.new Inner1();
		inner.display();

		Inner2 obj1 = new InnerClassExample1.Inner2();
		obj1.display();

		class Inner3 {
			void display() {
				System.out.println("Local Inner Class");
			}
		}
		Inner3 obj2 = new Inner3();
		obj2.display();

		Inner4 obj3 = new Inner4() {
			public void display() {
				System.out.println("Annonymous Inner Class");
			}
		};
		
		obj3.display();
	}

}
