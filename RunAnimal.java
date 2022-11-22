import java.util.Scanner;
public class RunAnimal {
	
	public static void main (String[] args) {
		Bird tori = new Bird();
		Cat neko = new Cat();
		Dog inu = new Dog();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an animal. Press B for bird, C for cat, or D for Dog: ");
		String name = sc.nextLine();
	
		if(name.equalsIgnoreCase("B")){
			tori.eat();
			tori.sleep();
			tori.makeSound();
		}
		else if(name.equalsIgnoreCase("C")){
			neko.eat();
			neko.sleep();
			neko.makeSound();
		}
		else if(name.equalsIgnoreCase("D")){
			inu.eat();
			inu.sleep();
			inu.makeSound();
		}
		else {
			System.out.println("Invalid input");
		}
		
    }
	
}