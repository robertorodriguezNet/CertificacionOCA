public class Varios{
	
	public static void main(String[] args){
		
		tiposPrimitivos();
		
	}
	
	public static void tiposPrimitivos(){
		// Este código imprime "true"
		// -  verdadero
		// -* falso
		
		/*
			PS E:\OCA\workspace-oca\CertificacionOCA\root\com\ejercicios> javac .\Varios.java
			.\Varios.java:15: error: incompatible types: possible lossy conversion from short to char
                char c = s;                // char -> 16 bits
                         ^
			1 error
			
			EXPLICACION
			Un short solo se puede asignar a un char si su valor cabe en un char.
			short s cabe en char c, pero es una variable.
			
			final short s = Short.MAX_VALUE sí es una declaración válida.
		*/
		
		short s = Short.MAX_VALUE; // 16 bits
		char  c = s;                // char -> 16 bits		
		System.out.println( c == Short.MAX_VALUE);	
	}
	
}