class Finally{  
 
	public static void main(String[] args){
		
		short s = Short.MAX_VALUE; // -32,768 a 32,767

		char c = s;

		System.out.println( c == Short.MAX_VALUE);

	}
}

/* -------------------------------------------------------------------
Error de compilanción

Si s se declara final, el valor de s queda fijado en 32,767 y el resultado es TRUE

Formación@hp15cs MINGW64 /e/OCA/CertificacionOCA/converiotipos (Formacion)
$ javac ShortToChar.java
ShortToChar.java:7: error: incompatible types: possible lossy conversion from short to char
                char c = s;
                         ^
1 error
------------------------------------------------------------------- */