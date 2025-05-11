/*
	Declaración de clases correctas.
	No es obligatorio que exista una clase pública.
	Los nombres de las clases no comienzan con mayúscula, pero es una convención, no es obligatorio.
*/
import java.io.*;
import static java.lang.System.*;

class anothermain{
	public static void main(String[] args){
		out.println("hello2");
	}
}

class main{
	public final static void main(String[] args){
		out.println("hello");
	}
}

// Esta clase compila, el método main tiene una firma diferente a la main principal
class A{
	public static void main() throws IOException{
		out.println("Metodo main con otra firma");
	}
}