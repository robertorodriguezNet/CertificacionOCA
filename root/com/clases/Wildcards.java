
import java.util.Random;
import static java.lang.Math.sqrt;

public class Wildcards{
	
	public static void main (String[] args){
		
		// Random es un método de java.util y hay que importarlo
		Random r = new Random();
		
		System.out.println(r.nextInt(10));
		
		// sqrt es un método estático de Math
		// Podemos importar java.lang Math.* o java.lang.Math.sqrt
		
		// Importando java.lang.Math.sqrt
		sqrt(4);
		
		// Importando java.lang.Math.*
		Math.sqrt(4);
	}
}