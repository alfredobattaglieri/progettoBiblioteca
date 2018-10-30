package it.biblioteca.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Film;
import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Regista;
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
		
		
		
		
		if(genere.equals(Genere.HORROR.name())) {
			List<Film> listaHorror=new ArrayList<>();
			List<Horror> listaLibriHorror=new ArrayList<>();
			List<Regista> list_registiHorror=new ArrayList<>();

			Horror horror= new Horror(titolo, Autore,pagine,Genere.HORROR.name());
			horror.setList_registiHorror(list_registiHorror);
			horror.setListaLibriHorror(listaLibriHorror);
			horror.setListaHorror(listaHorror);
			biblioteca.getLista_libro_horror().add(horror);
			biblioteca.setLista_libro_horror(biblioteca.getLista_libro_horror());
			System.out.println(biblioteca);
			
		}	
		else if(genere.equals(Genere.THRILLER.name())) {
			Thriller thriller=new Thriller(titolo, Autore,pagine,Genere.THRILLER);
			biblioteca.getLista_libro_thriller().add(thriller);
		}
		else if(genere.equals(Genere.ROMANZO.name())) {
			Romanzo romanzo=new Romanzo(titolo, Autore,pagine,Genere.ROMANZO);
			biblioteca.getLista_libro_romanzo().add(romanzo);
		}
		else if(genere.equals(Genere.STORIA.name())){
			Storia storia=new Storia(titolo, Autore,pagine,Genere.STORIA);
			biblioteca.getLista_libro_storia().add(storia);
		}
		
		return biblioteca;
		
	}
		
		
		
		
		
		@Override
	public void deleteLibro(Long id) {
		
	}





		

}
