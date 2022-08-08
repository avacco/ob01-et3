package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Suma de 1 + 2 + 3 es igual a: "+suma(1,2,3));
		Coche coche = new Coche();
		
		coche.quitarPuertas();
		
		coche.ponerPuertas();
		coche.ponerPuertas();
		
		System.out.println("El numero de puertas del coche es: "+coche.getPuertas());
	}
	
	public static int suma(int a, int b, int c) {
		
		return a+b+c;
	}

}
