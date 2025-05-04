/*
	Es posible definir más de una clase en un mismo archivo.
	Para cada clase se generará un archivo .class.
	Tan solo puede haber una clase pública, y esta ha de tener
	el mimso nombre que el fichero.
*/

public class ClasesDiferentes{}

class UnaClase{}

class OtraClase{}

/*
Si se intenta compilar el archivo con esta clase, se gnera un error de compilación:
	
.\ClasesDiferentes.java:15: error: class ClaseMala is public, should be declared in a file named ClaseMala.java
public class ClaseMala{}
		   ^
1 error
*/

/*
Si se intenta compilar el archivo con la clase ClaseMala como única clase pública,
se genera un error de compilación al no tener el mimso nombre del archivo:
	
.\ClasesDiferentes.java:22: error: class ClaseMala is public, should be declared in a file named ClaseMala.java
public class ClaseMala{}
       ^
1 error
*/
//public class ClaseMala{}
