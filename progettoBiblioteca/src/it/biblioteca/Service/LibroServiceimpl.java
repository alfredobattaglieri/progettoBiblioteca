package it.biblioteca.Service;

import java.util.List;
import java.util.Scanner;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Romanzo;
import it.biblioteca.model.Storia;
import it.biblioteca.model.Thriller;

public class LibroServiceimpl implements LibroService {
	Scanner input=new Scanner(System.in);
	
	
	@Override
	public Biblioteca creaLibro(Biblioteca biblioteca) {
		System.out.println("crea il tuo Libro");
		System.out.println("inserisci Titolo");
		String titolo=input.nextLine();
		System.out.println("inserisci Autore");
		String Autore=input.nextLine();
		System.out.println("inserisci numero di Pagine");
		int pagine=input.nextInt();
		input.nextLine();
		System.out.println("inserisci Genere");
		String genere=input.nextLine();
		
		if(genere.equals(Genere.HORROR)) {
			Horror horror= new Horror(titolo, Autore,pagine,Genere.HORROR);
			biblioteca.getLista_libro_horror().add(horror);
		}	
		else if(genere.equals(Genere.THRILLER)) {
			Thriller thriller=new Thriller(titolo, Autore,pagine,Genere.THRILLER);
			biblioteca.getLista_libro_thriller().add(thriller);
		}
		else if(genere.equals(Genere.ROMANZO)) {
			Romanzo romanzo=new Romanzo(titolo, Autore,pagine,Genere.ROMANZO);
			biblioteca.getLista_libro_romanzo().add(romanzo);
		}
		else {
			Storia storia=new Storia(titolo, Autore,pagine,Genere.STORIA);
			biblioteca.getLista_libro_storia().add(storia);
		}
		
		return biblioteca;
		
	}
		
		
		
		
		
		@Override
	public void deleteLibro(Long id) {
		
	}





		

}
