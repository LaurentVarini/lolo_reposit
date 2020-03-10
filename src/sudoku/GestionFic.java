package sudoku;
import java.io.*;
import java.util.*;


public class GestionFic {

		public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String nomFic = "test.txt";
		
		System.out.println("Exo de lecture de fichier");
		System.out.println("le fichier s'appelle : "+ nomFic);
		
		File file = new File(nomFic);
		
		System.out.println("Tentative de lecture du fichier: "+ file.getCanonicalPath());
		
				
		BufferedReader buffer = new BufferedReader(new FileReader(file)); 
		
		String ligneFic; 
		int num=0;
		int[] ligne= {0,0,0,0,0,0,0,0,0};
		Ligne li;
		
		
		li = new Ligne(num, ligne);
		
		
		
		while ((ligneFic = buffer.readLine()) != null) 
		{
			System.out.println(ligneFic);
			System.out.println(li);
						
		}
		
		System.out.println("****On est au bout le fichier est vide!****");
			
	}

}
