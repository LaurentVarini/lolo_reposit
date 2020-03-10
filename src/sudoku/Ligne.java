package sudoku;

import java.util.Arrays;

public class Ligne {

	private int numero = 0;
	private int[] ligne = {0,0,0,0,0,0,0,0,0};
	
	public Ligne(int numero, int[] ligne) {
		// TODO Auto-generated constructor stub
		super();
		this.numero = numero;
		this.ligne = ligne;
		
	}
	
	public void setLigne(int [] ligne) {
		int i;
			
		for(i=0; i<9; ++i) 
		{
			this.ligne[i] = ligne[i];
			
		}
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setElement(int position, int valeur ) {
		this.ligne[position] = valeur;
	}
	
	public int getElement(int position) {
		return this.ligne[position];
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int[] getLigne() {
		
		return this.ligne;
	}

	@Override
	public String toString() {
		return "Ligne [numero=" + numero + ", ligne=" + Arrays.toString(ligne) + "]";
	}
	
}
