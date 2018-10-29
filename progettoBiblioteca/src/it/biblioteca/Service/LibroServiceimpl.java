package it.biblioteca.Service;

import java.util.List;
import java.util.Scanner;

import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Romanzo;
import it.biblioteca.model.Storia;
import it.biblioteca.model.Thriller;

public class LibroServiceimpl implements LibroService {

	@Override
	public List<Libro> creaLibro(List<Libro> listaLibri) {
		Scanner input=new Scanner(System.in);
		
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
			listaLibri.add(horror);
		}	
		else if(genere.equals(Genere.THRILLER)) {
			Thriller thriller=new Thriller(titolo, Autore,pagine,Genere.THRILLER);
			listaLibri.add(thriller);
		}
		else if(genere.equals(Genere.ROMANZO)) {
			Romanzo romanzo=new Romanzo(titolo, Autore,pagine,Genere.ROMANZO);
			listaLibri.add(romanzo);
		}
		else {
			Storia storia=new Storia(titolo, Autore,pagine,Genere.STORIA);
		    listaLibri.add(storia);
		    
		}
		return listaLibri;
		
	}
		
		
		
		
		
		@Override
	public void deleteLibro(Long id) {
		
	}

}
