package it.biblioteca.Service;

import java.util.Scanner;

import it.biblioteca.model.Attore;


  
public class Attoreserviceimpl implements AttoreService {
	Scanner input= new Scanner(System.in);
	@Override
	
	public Attore creaAttore() {
	    System.out.println("crea attore");
	    System.out.println("Inserisci nome");
		String nome=input.nextLine();
	    System.out.println("Inserisci Cognome");
		String cognome=input.nextLine();
	    System.out.println("Inserisci età");
		int eta=input.nextInt();
		Attore attore=new Attore(nome , cognome , eta);
		long id=attore.incrementaId(attore.getId());
		attore.setId(id);
		return attore;
		
	    
		
		
		
		
		
	}

}
