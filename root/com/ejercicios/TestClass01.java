/*
What will the following code print whern run?

Hello
It will not print anything
It will not compile
* It will throw an Error at runtime
None of the above

EXPLICACIÓN
When the program is run, the JVM looks for a method named main() wich takes un array
of Strings as input and returns nothing.
But in this case, it dosen't find such a method so it gives out the following message:

Al ejecutar el programa, la JVM busca un método llamado main() que toma como entrada 
un array de Strings y no devuelve nada. 
Pero en este caso, no encuentra dicho método, por lo que muestra el siguiente mensaje:

$ java TestClass01
Error: el método principal debe devolver un valor del tipo void en la clase TestClass01,
defina el método principal del siguiente modo:
   public static void main(String[] args)


*/

public class TestClass01{
	
	public static long main( String[] args){
	
		System.out.println("Hello");
		return 10L;
	}
}