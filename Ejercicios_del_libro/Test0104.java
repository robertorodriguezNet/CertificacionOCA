enum Animals{
    DOG("off"), CAT("meow"), FISH("burble");
    String sound;
    Animals (String s){
        sound = s;
    }
}

class TestEnum{
    static Animals a;
    public static void main(String[] args){
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}

/**
¿Cuál es el resultado?
A.   woof burble
B.   Múltiples errores de compilación
C.   La compilación falla debido a un error en la línea 2
D.   La compilación falla debido a un error en la línea 3
E.   La compilación falla debido a un error en la línea 4
F.   La compilación falla debido a un error en la línea 9




































PS E:\OCA\CertificacionOCA\Ejercicios_del_libro> javac .\Test0104.java
PS E:\OCA\CertificacionOCA\Ejercicios_del_libro> java TestEnum
off burble
PS E:\OCA\CertificacionOCA\Ejercicios_del_libro>



*/