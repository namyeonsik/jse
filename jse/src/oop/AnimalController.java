package oop;

public class AnimalController {

	public static void main(String[] args) {
		AnimalService cat = new CatServiceImpl();
		AnimalService dog = new DogServiceImpl();
		
		dog.bark();
	}
}
