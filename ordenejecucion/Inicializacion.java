public class Inicializacion{

	public Inicializacion(){
		number = 5;       // 3
	}

	public static void main(){String[] args){
		Inicializacion ini = new Inicializacion();
		System.out.println(ini.number);
	}

	private int number = 3;   // 1
	
	{
		number = 4;       // 2
	}

}

