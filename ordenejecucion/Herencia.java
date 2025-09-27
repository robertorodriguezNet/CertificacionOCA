class Padre {
    static {
        System.out.println("Padre static");
    }

    {
        System.out.println("Padre instancia");
    }

    public Padre() {
        System.out.println("Constructor Padre");
    }
}

class Hijo extends Padre {
    static {
        System.out.println("Hijo static");
    }

    {
        System.out.println("Hijo instancia");
    }

    public Hijo() {
        System.out.println("Constructor Hijo");
    }

    public static void main(String[] args) {
        new Hijo();
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
* Padre static
* Hijo static
* Padre instancia
* Constructor Padre
* Hijo instancia
* Constructor Hijo
*
* Explicación:
* 1. Primero se ejecutan los bloques estáticos de la superclase y luego de la subclase.
* 2. Luego los bloques de instancia y constructores, en orden de herencia.
*/
