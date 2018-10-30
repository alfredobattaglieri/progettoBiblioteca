package it.biblioteca.Service;

import java.util.Scanner;


import it.biblioteca.model.Scrittore;

public class ScrittoreServiceimpl implements ScrittoreService{

	@Override
	public Scrittore CreaScrittore() {
		Scanner Input= new Scanner(System.in);
	    System.out.println("crea Scrittore");
	    System.out.println("Inserisci nome");
		String nome=Input.nextLine();
	    System.out.println("Inserisci Cognome");
		String cognome=Input.nextLine();
	    System.out.println("Inserisci età");
		int eta=Input.nextInt();
		Scrittore scrittore=new Scrittore(nome , cognome , eta);
		long id= scrittore.incrementaId(scrittore.getId());
		scrittore.setId(id);
		return scrittore;
	}

}
