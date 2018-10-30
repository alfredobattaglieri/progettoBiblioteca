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
		input.nextLine();
		System.out.println("DURATA:");
		int durata = input.nextInt();
		input.nextLine();
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
	public void visualizzaLibroIspiratoPiuFilm(Biblioteca biblioteca){
		Libro horrorPF = null;
		Libro thrillerPF = null;
		int contaH = 0;
		int contaT = 0;
		
		for(int i=0;i<biblioteca.getLista_libro_horror().size();i++) {
			for(int j=0;j<biblioteca.getLista_libro_horror().get(i).getListaHorror().size();j++) {
				if(biblioteca.getLista_libro_horror().get(i).getListaHorror().size() > contaH) {
					contaH = biblioteca.getLista_libro_horror().get(i).getListaHorror().size();
					horrorPF = biblioteca.getLista_libro_horror().get(i);
				}
			}
		}
		
		for(int i=0;i<biblioteca.getLista_libro_thriller().size();i++) {
			for(int j=0;j<biblioteca.getLista_libro_thriller().get(i).getListaThriller().size();j++) {
				if(biblioteca.getLista_libro_thriller().get(j).getListaThriller().size() > contaH) {
					contaT = biblioteca.getLista_libro_thriller().get(j).getListaThriller().size();
					thrillerPF = biblioteca.getLista_libro_thriller().get(i);
				}
			}
		}
				
		if(contaH > contaT) {
			System.out.println(horrorPF);
		}
		else {
			System.out.println(thrillerPF);
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
	
	