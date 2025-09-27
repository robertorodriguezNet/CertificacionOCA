public class EjercicioOrdenEjecucion {
    
    private String mensaje = inicializarMensaje();
    private static String mensajeEstatico = inicializarMensajeEstatico(); // 1
    
    static {
        System.out.println("1. Bloque estático ejecutado");
    }
    
    {
        System.out.println("2. Bloque de inicialización de instancia ejecutado");
    }
    
    public EjercicioOrdenEjecucion() {
        System.out.println("3. Constructor ejecutado");
    }
    
    public EjercicioOrdenEjecucion(String param) {
        this();
        System.out.println("4. Constructor con parámetros ejecutado: " + param);
    }
    
    private String inicializarMensaje() {
        System.out.println("5. Inicializando variable de instancia");
        return "Mensaje de instancia";
    }
    
    private static String inicializarMensajeEstatico() {
        System.out.println("6. Inicializando variable estática");
        return "Mensaje estático";
    }
    
    {
        System.out.println("7. Segundo bloque de inicialización de instancia");
    }
    
    static {
        System.out.println("8. Segundo bloque estático ejecutado");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Creando primera instancia ===");
        EjercicioOrdenEjecucion obj1 = new EjercicioOrdenEjecucion();
        
        System.out.println("\n=== Creando segunda instancia ===");
        EjercicioOrdenEjecucion obj2 = new EjercicioOrdenEjecucion("Parámetro");
    }
}

/*




















RESPUESTA DEL EJERCICIO:

El orden de ejecución correcto es:

=== Creando primera instancia ===
6. Inicializando variable estática
1. Bloque estático ejecutado
8. Segundo bloque estático ejecutado
5. Inicializando variable de instancia
2. Bloque de inicialización de instancia ejecutado
7. Segundo bloque de inicialización de instancia
3. Constructor ejecutado

=== Creando segunda instancia ===
5. Inicializando variable de instancia
2. Bloque de inicialización de instancia ejecutado
7. Segundo bloque de inicialización de instancia
3. Constructor ejecutado
4. Constructor con parámetros ejecutado: Parámetro

EXPLICACIÓN DEL ORDEN:

1. PRIMERA INSTANCIA:
   - Variables estáticas se inicializan primero (solo una vez)
   - Bloques estáticos se ejecutan en orden de aparición (solo una vez)
   - Variables de instancia se inicializan
   - Bloques de inicialización de instancia se ejecutan en orden
   - Constructor se ejecuta al final

2. SEGUNDA INSTANCIA:
   - Los elementos estáticos NO se ejecutan de nuevo
   - Solo se ejecutan elementos de instancia y constructores
   - El constructor con parámetros llama a this(), ejecutando primero el constructor sin parámetros

PUNTOS CLAVE PARA EL EXAMEN OCA:
- Los elementos estáticos se ejecutan solo UNA VEZ cuando la clase se carga
- El orden es: estáticos → instancia → constructor
- Los bloques se ejecutan en el orden que aparecen en el código
- Las variables se inicializan antes que los bloques del mismo tipo
- this() debe ser la primera línea en un constructor
*/