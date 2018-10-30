package it.biblioteca.Service;

import java.util.Scanner;


import it.biblioteca.model.Scrittore;

public class ScrittoreServiceimpl implements ScrittoreService{
	Scanner input= new Scanner(System.in);
	@Override
	public Scrittore CreaScrittore() {
	   System.out.println("crea Scrittore");
	    System.out.println("Inserisci nome");
		String nome=input.nextLine();
	    System.out.println("Inserisci Cognome");
		String cognome=input.nextLine();
	    System.out.println("Inserisci età");
		int eta=input.nextInt();
		Scrittore scrittore=new Scrittore(nome , cognome , eta);
		long id= scrittore.incrementaId(scrittore.getId());
		scrittore.setId(id);
		return scrittore;
	}

}
