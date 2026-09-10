package lambdas.dogs.v1;

import java.util.*;
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
    }

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