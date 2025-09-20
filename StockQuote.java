/*
  Considere la estructura de directorio que se muestra en la 
  Imagen 1 que muestra las carpetas y clases disponibles y 
  el código que se proporciona a continuación:
*/

class StockQuote{  
 
	Stock stock;   

	public StockQuote(Stock s)  {   }   

	public void store() throws IOException{      
		Util.store(stock);   
	}   

	public double computePrice(){     
		return Helper.getPricer(stock).price();   
	} 
} 

/*
	com
	 |-- Helper.class
	 |-- enthu
	       |-- Util.class
               |-- rad
		    |-- Stock.class

Suponiendo que el código utiliza llamadas de método válidas, 
¿qué declaraciones DEBEN agregarse a la clase anterior?

- package com.enthu.rad.*;   
- import com.enthu.*;        -- Importar las clases del paquete enthu
- package com.enthu.rad;     -- La clase StockQuote se encuentra en el paquete rad
- import com.*;              -- Importar todas las clases del paquete com
- import java.io.*;          -- Para importar IOExceptiom 
- It is not required to import java.io.* or import java.io.IOException 
  because java.io package is imported automatically.
*/