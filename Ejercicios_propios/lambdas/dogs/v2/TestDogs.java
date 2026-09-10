package lambdas.dogs.v2;

import java.util.*;
import java.util.function.Predicate;

import lambdas.dogs.Dog;

public class TestDogs{
	
    public static void main(String[] args) {
		
        ArrayList<Dog> dogs = new ArrayList<>();    
        dogs.add(new Dog("boi", 30, 6));            
		dogs.add(new Dog("tyri", 40, 12));
        dogs.add(new Dog("charis", 120, 7));        
		dogs.add(new Dog("raiko", 50, 10));
        dogs.add(new Dog("clover", 35, 12));        
		dogs.add(new Dog("mia", 15, 4));
        dogs.add(new Dog("zooey", 45, 8));
    
        System.out.println("all dogs " + dogs);                            // all dogs [boi, tyri, charis, raiko, clover, mia, zooey]
        System.out.println("min age 7 " + minAge(dogs, 7).toString());     // min age 7 [tyri, charis, raiko, clover, zooey]
        System.out.println("max wght. " + maxWeight(dogs, 40).toString()); // max wght. [boi, tyri, clover, mia]
		
        System.out.println("age < 9 " + dogQuery(dogs, dog -> dog.getAge() < 9 ));                            // all dogs [boi, tyri, charis, raiko, clover, mia, zooey]
        System.out.println("weigth > 100 " + dogQuery(dogs, dog -> dog.getWeigth() > 100 ));                            // all dogs [boi, tyri, charis, raiko, clover, mia, zooey]
		
    }
	
	static ArrayList<Dog> dogQuery(ArrayList<Dog> dogs, Predicate<Dog> expr){
		
		ArrayList<Dog> result = new ArrayList<>();
		for(Dog dog: dogs){
			if(expr.test(dog))
				result.add(dog);
		}
	
		return result;
	}
	
	
	// ======================== V1  ========================

	// Query methods
	static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor){
	
		ArrayList<Dog> result = new ArrayList<>();
		for(Dog dog: dogList){
	
		  if(dog.getAge() >= testFor)	
		  	result.add(dog);			
		  
		}
		
		return result;
	}	
	
	static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor){
	
		ArrayList<Dog> result = new ArrayList<>();
		for(Dog dog: dogList){
	
		if(dog.getWeigth() <= testFor)			
			result.add(dog);			
		}
		
		return result;
	}
}