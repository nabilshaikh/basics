package interfacee;

public class Demo {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		/*animal1.sound();
		animal1.base1();
		animal1.base2();
		
		System.out.println("----------------------------------");
		
		Dog dog1 = new Dog();
		dog1.sound();
		dog1.base1();
		dog1.base2();
		
		System.out.println("----------------------------------");*/
		
		Cat cat1 = (Cat) animal1; 
		cat1.sound();
		cat1.base1();
		cat1.base2();
		
		
	}

}
