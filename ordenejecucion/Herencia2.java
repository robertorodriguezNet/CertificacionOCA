class SuperClase {

    static {
        System.out.println("SuperClase: bloque estático"); // 1
    }

    {
        System.out.println("SuperClase: bloque de instancia"); // 3
    }

    public SuperClase() {
        System.out.println("SuperClase: constructor"); // 4
    }
}

class SubClase extends SuperClase {

    static {
        System.out.println("SubClase: bloque estático"); // 2
    }

    {
        System.out.println("SubClase: bloque de instancia"); // 5
    }

    public SubClase() {
        System.out.println("SubClase: constructor"); // 6
    }

    public static void main(String[] args) {
        new SubClase();
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
 * SuperClase: bloque estático
 * SubClase: bloque estático
 * SuperClase: bloque de instancia
 * SuperClase: constructor
 * SubClase: bloque de instancia
 * SubClase: constructor
 *
 * Explicación:
 * 1. Se ejecutan primero los bloques estáticos de la superclase y luego de la
 * subclase.
 * 2. Al crear la instancia, se ejecutan primero los bloques de instancia y
 * constructor de la superclase.
 * 3. Luego los bloques de instancia y constructor de la subclase.
 */
