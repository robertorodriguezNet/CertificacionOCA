package lambdas.dogs;

public class Dog{

	private String name;
	private int    weigth;
	private int    age;
	
	public Dog(String name, int weigth, int age){
			this.name   = name;
			this.weigth = weigth;
			this.age    = age;
	}
	
	public String getName(){return name;}
	public int getWeigth(){return weigth;}
	public int getAge(){return age;}
	
	public String toString(){return name;}
}