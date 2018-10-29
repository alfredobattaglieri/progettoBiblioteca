package it.biblioteca.Service;

import java.util.Scanner;

import it.biblioteca.model.Attore;


  
public class Attoreserviceimpl implements AttoreService {

	@Override
	
	public Attore creaAttore() {
		Scanner Input= new Scanner(System.in);
	    System.out.println("crea attore");
	    System.out.println("Inserisci nome");
		String nome=Input.nextLine();
	    System.out.println("Inserisci Cognome");
		String cognome=Input.nextLine();
	    System.out.println("Inserisci età");
		int eta=Input.nextInt();
		Attore attore=new Attore(nome , cognome , eta);
		return attore;
		
	    
		
		
		
		
		
	}

}
