
//Consider the classes shown below:
class A{
   public A() { }
   public A(int i) {   System.out.println(i );    }
}

class B{

   static A s1 = new A(1);
   A a = new A(2);

   public static void main(String[] args){
      B b = new B();
      A a = new A(3);
   }

   static A s2 = new A(4);
}
// Which is the correct sequence of the digits that will be printed when B is run?
// 1 2 3 4  
// 1 4 2 3 - primero las de clase, luego las de instancia, luego el método
// 2 1 4 3 
// 2 3 1 4
/*
- Los campos y los bloques inicializadores de instancias se ejecutan en el orden en que aparecen en el archivo.
- El constructor se ejecuta después de que se hayan ejecutado todos los campos y bloques inicializadores de instancia.
*/