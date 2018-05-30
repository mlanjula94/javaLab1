package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	void eat() {
		System.out.println(name + " is eating.");
	}
	void email() {
		System.out.println(email);
	}
}

public class Demo {
	public static void main(String[] args) {
	// Instantiate an object
	Person person1 = new Person();
	
	//Define some properties
	person1.name ="Joe";
	person1.email = "joe@gmail.com";
	person1.phone = "3476662384";
	
	person1.walk();
	person1.eat();
	
	// Instantiate an object
		Person person2 = new Person();
		
		//Define some properties
		person2.name ="Sarah";
		person2.email = "sarah@gmail.com";
		person2.phone = "3476662887";
		
		person2.email();
		
	}
}
