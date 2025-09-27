public class OrdenEjecucion1 {

    static String s1 = metodo("A");

    String s2 = metodo("B");

    static {
        metodo("C");
    }

    {
        metodo("D");
    }

    public OrdenEjecucion1() {
        metodo("E");
    }

    public static void main(String[] args) {
        new OrdenEjecucion1();
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
* A
* C
* B
* D
* E
*
* Explicación:
* 1. Se ejecutan los miembros estáticos en orden: s1 → bloque estático.
* 2. Luego los miembros de instancia: s2 → bloque de instancia.
* 3. Finalmente el constructor.
*/
