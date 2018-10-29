package it.biblioteca.Service;

import java.util.List;
import java.util.Scanner;

import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;

import it.biblioteca.model.Thriller;

public class LibroServiceimpl implements LibroService {
	Scanner input=new Scanner(System.in);
	@Override
	public void creaLibro(List<Horror>listaLibriHorror,List<Thriller>listaLibriThriller) {
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
			listaLibriHorror.add(horror);
		}	
		else if(genere.equals(Genere.THRILLER)) {
			Thriller thriller=new Thriller(titolo, Autore,pagine,Genere.THRILLER);
			listaLibriThriller.add(thriller);
		}
		
	}
		
		
		
		
		
		@Override
	public void deleteLibro(Long id) {
		
	}

}
