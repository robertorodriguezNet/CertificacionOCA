package other;
import certification.Parent;

public class Child extends Parent {

    public static void main(String[] args){
        Child child = new Child();   
        child.testDefault();
    }

    private void testProtected(){
        System.out.println("x is " + x);
    }

    private void testDefault(){
	System.out.println("y is " + y);
    }
}

/*
PS E:\OCA\Ejercicios_del_libro\Modificadores> javac .\certification\Parent.java .\other\Child.java
.\other\Child.java:16: error: y is not public in Parent; cannot be accessed from outside package
        System.out.println("y is " + y);
                                     ^
1 error
*/