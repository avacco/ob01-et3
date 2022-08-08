package main;

public class Coche {

	private int puertas = 4;
	
	
	
	public int getPuertas() {return puertas;}

	public void ponerPuertas() {
		puertas++;
		System.out.println("Se ha añadido una puerta, las puertas ahora son: "+puertas);
	}
	
	public void quitarPuertas() {
		puertas--;
		System.out.println("Se ha quitado una puerta, las puertas ahora son: "+puertas);
	}
}
