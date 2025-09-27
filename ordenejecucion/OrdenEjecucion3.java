public class OrdenEjecucion3 {

    static String s1 = metodo("X");

    String s2 = metodo("Y");

    {
        s2 = metodo("Z");
    }

    static {
        s1 = metodo("W");
    }

    public OrdenEjecucion3() {
        s2 = metodo("K");
    }

    public static void main(String[] args) {
        new OrdenEjecucion3();
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
* X
* W
* Y
* Z
* K
*
* Explicación:
* 1. s1 se inicializa con "X", luego el bloque estático lo sobrescribe con "W".
* 2. s2 se inicializa con "Y", luego el bloque de instancia lo sobrescribe con "Z".
* 3. El constructor lo sobrescribe con "K".
*/
