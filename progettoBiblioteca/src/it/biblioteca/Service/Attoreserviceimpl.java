package it.biblioteca.Service;

import java.util.Scanner;

import it.biblioteca.model.Attore;
import it.biblioteca.model.Biblioteca;


  
public class Attoreserviceimpl implements AttoreService {
	Scanner input= new Scanner(System.in);
	@Override
	
	public Attore creaAttore(Biblioteca biblioteca) {
		System.out.println("crea attore");
	    System.out.println("Inserisci nome");
		String nome=input.nextLine();
	    System.out.println("Inserisci Cognome");
		String cognome=input.nextLine();
	    System.out.println("Inserisci età");
		int eta=input.nextInt();
		Attore attore=new Attore(nome , cognome , eta);
		long id=attore.incrementaId(attore.getIdCodiceAttore());
	    biblioteca.getLista_attore().add(attore);
		return attore;
	}

}
