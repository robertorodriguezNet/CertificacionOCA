class Finally{  
 
	public static void main(String[] args){
		
		try{
		    // Finaliza inmediatamente la JVM
                    // No devuelve el control al programa
                    System.exit(0); 
                                    
              }
              // Finally se ejecuta siempre, excepto con System.exit(),
              // que detiene la JVM
              finally{
                     System.out.println("finally is always executed!");
              }
	}
}

/* -------------------------------------------------------------------
No imprime nada

Excepción a la regla
El único caso en que finally sí se ejecutaría tras System.exit() es si se 
lanza una SecurityException que impide la salida:

System.setSecurityManager(new SecurityManager() {
    @Override
    public void checkExit(int status) {
        throw new SecurityException("Salida bloqueada");
    }
}


------------------------------------------------------------------- */