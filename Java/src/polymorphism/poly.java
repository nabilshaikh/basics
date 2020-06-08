package polymorphism;	
	
class Animal{
	public void sound() {
		System.out.println("animal");	
		}
}	

class Dog extends Animal{
	
	public void sound() {
		System.out.println("Woof woof!");
	}
	
	public void dogSound() {
		System.out.println("bhav bhav");
	}
}

class Cat extends Animal{
	public void catSound() {
		System.out.println("meow");
	}
}

public class poly{
	public static void main(String[] args) {
		/*//fails
		B b = (B)new A();
		b.a();
		b.c();
		*/
		
		/*
		//fails
		A a = new A();
		B b = (B)a;
		b.a();
		b.c();
		*/
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
			
		//Cat caat = (Cat)new Animal();
		//caat.catSound();
		
		
		
		
		
		
		
		
	}
}

