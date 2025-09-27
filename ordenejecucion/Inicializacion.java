public class Inicializacion{

	public Inicializacion(){
		number = 5;       // 3
	}

	public static void main(String[] args){
		Inicializacion ini = new Inicializacion();
		System.out.println(ini.number);
	}

	private int number = 3;   // 1
	
	{
		number = 4;       // 2
	}

}

/*
* ¿Qué se debe imprimir
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* Se imprime 5
*
*
* Primero se ejecutan las propiedades:
*  1 Las de clase
*  2 Las de instancia 
*
*
*
*
*/