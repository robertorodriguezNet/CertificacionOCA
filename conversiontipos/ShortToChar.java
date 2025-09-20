class ShortToChar{  
 
	public static void main(String[] args){
		
		short s = Short.MAX_VALUE;

		char c = s;

		System.out.println( c == Short.MAX_VALUE);

	}
}

/*
Formación@hp15cs MINGW64 /e/OCA/CertificacionOCA/converiotipos (Formacion)
$ javac ShortToChar.java
ShortToChar.java:7: error: incompatible types: possible lossy conversion from short to char
                char c = s;
                         ^
1 error


*/