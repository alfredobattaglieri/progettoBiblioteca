package it.biblioteca.Service;

import java.util.Scanner;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Film;
import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public class FilmServiceImpl implements FilmService{
	Scanner input=new java.util.Scanner(System.in);
		
	public void creaFilm() {
		Horror horror = null;
		Thriller thriller = null;
		
		System.out.println("INSERISCI NUOVO FILM:");
		System.out.println("ID:");
		long id = input.nextLong();
		System.out.println("TITOLO:");
		String titolo=input.nextLine();
		System.out.println("DURATA:");
		int durata = input.nextInt();
		System.out.println("GENERE:");
		String genere = input.nextLine();
		
		if(genere.equals(Genere.HORROR)) {
			Film film = new Film(id, titolo, durata, Genere.HORROR);
			//stampa lista libri horror
			for(int i=0; i<horror.getListaLibriHorror().size(); i++) {
				horror.getListaLibriHorror().get(i).toString();
			}
			associaLibroHorror(film, horror);
		}
		if(genere.equals(Genere.THRILLER)) {
			Film film = new Film(id, titolo, durata, Genere.THRILLER);
			//stampa lista libri thriller
			for(int j=0; j<thriller.getListaLibriThriller().size(); j++) {
				thriller.getListaLibriThriller().get(j).toString();
			}
			associaLibroThriller(film, thriller);
		}
	}
	
	@Override
	public Libro visualizzaLibroIspiratoPiuFilm(Biblioteca biblioteca){
		Libro horrorPF = null;
		Libro thrillerPF = null;
		int contaH = 0;
		
		for(int i=0;i<biblioteca.getLista_libro_horror().size();i++) {
			for(int j=0;j<biblioteca.getLista_libro_horror().get(i).getListaHorror().size();j++) {
				if(horror.getListaHorror().size() > contaH) {
					contaH = horror.getListaHorror().size();
					horrorPF = horror.getListaLibriHorror().get(i);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int contaH = 0;
		for(int i=0; i<horror.getListaLibriHorror().size(); i++) {
			if(horror.getListaHorror().size() > contaH) {
				contaH = horror.getListaHorror().size();
				horrorPF = horror.getListaLibriHorror().get(i);
			}
		}
		int contaT = 0;
		for(int j=0; j<thriller.getListaLibriThriller().size(); j++) {
			if(thriller.getListaThriller().size() > contaT) {
				contaT = thriller.getListaThriller().size();
				thrillerPF = thriller.getListaLibriThriller().get(j);
			}
		}
		
		if(contaH > contaT) {
			return horrorPF;
		}
		else {
			return thrillerPF;
		}	
	}

	@Override
	public void associaLibroHorror(Film film, Horror horror) {
		horror.getListaHorror().add(film);
	}
	@Override
	public void associaLibroThriller(Film film, Thriller thriller) {
		thriller.getListaThriller().add(film);
	}
}
	
	