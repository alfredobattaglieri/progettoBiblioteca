package it.biblioteca.Service;

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
		
		System.out.println("Crea il tuo Libro");
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
			List<Film> listaThriller=new ArrayList<>();
			List<Thriller> listaLibriThriller=new ArrayList<>();
			List<Regista> list_registiThriller=new ArrayList<>();
			
			Thriller thriller=new Thriller(titolo, Autore,pagine,Genere.THRILLER.name());
			thriller.setList_registaThriller(list_registiThriller);
			thriller.setListaLibriThriller(listaLibriThriller);
			thriller.setListaThriller(listaThriller);
			biblioteca.getLista_libro_thriller().add(thriller);
			biblioteca.setLista_libro_thriller(biblioteca.getLista_libro_thriller());
			System.out.println(biblioteca);
		}
		else if(genere.equals(Genere.ROMANZO.name())) {
			List<Film> listaRomanzo=new ArrayList<>();
			List<Romanzo> listaLibriRomanzo=new ArrayList<>();
			List<Regista> list_registiRomanzo=new ArrayList<>();
			
			Romanzo romanzo=new Romanzo(titolo, Autore,pagine,Genere.ROMANZO.name());
			romanzo.setList_registiRomanzo(list_registiRomanzo);
			romanzo.setListaLibriRomanzo(listaLibriRomanzo);
			romanzo.setListaRomanzo(listaRomanzo);
			biblioteca.getLista_libro_romanzo().add(romanzo);
			biblioteca.setLista_libro_romanzo(biblioteca.getLista_libro_romanzo());
			System.out.println(biblioteca);
		}
		else if(genere.equals(Genere.STORIA.name())){
			List<Film> listaStoria=new ArrayList<>();
			List<Storia> listaLibriStoria=new ArrayList<>();
			List<Regista> list_registiStoria=new ArrayList<>();
			
			Storia storia=new Storia(titolo, Autore,pagine,Genere.ROMANZO.name());
			storia.setList_registiStoria(list_registiStoria);
			storia.setListaLibriStoria(listaLibriStoria);
			storia.setListaStoria(listaStoria);
			biblioteca.getLista_libro_storia().add(storia);
			biblioteca.setLista_libro_storia(biblioteca.getLista_libro_storia());
			System.out.println(biblioteca);
		}
		
		return biblioteca;
		
	}
	
	@Override
	public void deleteLibro(Biblioteca biblioteca) {
		System.out.println("Quale genere di libro vuoi eliminare?");
		String genere=input.nextLine();
		if(genere.equals(Genere.HORROR.name())) {
			for(int i=0; i<biblioteca.getLista_libro_horror().size(); i++) {
				System.out.println(biblioteca.getLista_libro_horror().get(i));
			}
			System.out.println("Inserisci ID Libro:");
			int id=input.nextInt();
			biblioteca.getLista_libro_horror().remove(biblioteca.getLista_libro_horror().get(id));
		}
		else if(genere.equals(Genere.THRILLER.name())) {
			for(int i=0; i<biblioteca.getLista_libro_thriller().size(); i++) {
				System.out.println(biblioteca.getLista_libro_thriller().get(i));
			}
			System.out.println("Inserisci ID Libro:");
			int id=input.nextInt();
			biblioteca.getLista_libro_thriller().remove(biblioteca.getLista_libro_thriller().get(id));
		}
		else if(genere.equals(Genere.ROMANZO.name())) {
			for(int i=0; i<biblioteca.getLista_libro_romanzo().size(); i++) {
				System.out.println(biblioteca.getLista_libro_romanzo().get(i));
			}
			System.out.println("Inserisci ID Libro:");
			int id=input.nextInt();
			biblioteca.getLista_libro_romanzo().remove(biblioteca.getLista_libro_romanzo().get(id));
		}
		else if(genere.equals(Genere.STORIA.name())) {
			for(int i=0; i<biblioteca.getLista_libro_storia().size(); i++) {
				System.out.println(biblioteca.getLista_libro_storia().get(i));
			}
			System.out.println("Inserisci ID Libro:");
			int id=input.nextInt();
			biblioteca.getLista_libro_storia().remove(biblioteca.getLista_libro_storia().get(id));
		}
		else {
			System.out.println("Mi dispiace il genere inserito non esiste!");
		}
	}

}
