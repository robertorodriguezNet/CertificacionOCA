public class SwitchTest{
	public static void main(String[] args){
                
		SwitchTest test = new SwitchTest();
		test.switchTest((byte) 'b');
	}

	public void switchTest(byte x){
  	 	switch(x){
      			case 'b':   // 1
      			default :   // 2
      			case -2:    // 3
      			case 80:    // 4
   		}
	}
}

/*
¿Compilará?

- Esperado false KO
- Salida   true
 

byte: 1byte

'b' -> char 2 bytes
-2  -> promocona a int
80  -> byte


*/