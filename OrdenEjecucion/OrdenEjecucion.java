/*

	1.- Inicialización de la clase.
		Sólo si la clase, o alguno de sus miembros, no se ha invocado antes, entonces, la JVM ya la habría inicializado.
		Todas las constantes, variables y bloques estáticos en el orden en que se declaran.
	2.- Todas las constantes, variables y bloques no estáticos en el orden en que se declaran.
	3.- Constructor.

	PROCESO:
	.- Se ejecuta B
	.- Se instancia la clase
		.- Miembros estáticos	
			.- Se inicializa s1 y se imprime 1
			.- Se inicializa s2 y se imprime 4
		.- Miembros no estáticos
			.- Se inicialiaza a y se imprime 2
		.- Constructor:
			.- Se inicializa B, pero los miembros ya se han inicializado
			.- Se inicializa s2 y se imprime 3
*/
class A{
	public A(){}
	public A(int i){
		System.out.println(i);
	}
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
