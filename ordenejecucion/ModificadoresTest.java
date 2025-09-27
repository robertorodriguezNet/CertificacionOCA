public class ModificadoresTest {

    private static String privado = metodo("Privado estático");       // 1
    protected static String protegido = metodo("Protegido estático"); // 2
    public static String publico = metodo("Público estático");        // 3

    private String privadoInstancia = metodo("Privado instancia");    // 4
    protected String protegidoInstancia = metodo("Protegido instancia"); // 5
    public String publicoInstancia = metodo("Público instancia");     // 6

    static {
        metodo("Bloque estático");                                    // 7
    }

    {
        metodo("Bloque de instancia");                                // 8
    }

    public ModificadoresTest() {
        metodo("Constructor");                                        // 9
    }

    public static void main(String[] args) {
        new ModificadoresTest();                                      // 10
    }

    static String metodo(String s) {
        System.out.println(s);
        return s;
    }
}

/*
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
* Salida esperada:
* Privado estático
* Protegido estático
* Público estático
* Bloque estático
* Privado instancia
* Protegido instancia
* Público instancia
* Bloque de instancia
* Constructor
*
* Explicación:
* 1. Se ejecutan primero los campos estáticos en orden, sin importar su modificador.
* 2. Luego el bloque estático.
* 3. Al crear la instancia, se ejecutan los campos de instancia en orden, luego el bloque de instancia y el constructor.
* 4. Los modificadores (`private`, `protected`, `public`) no afectan el orden de ejecución.
*/

