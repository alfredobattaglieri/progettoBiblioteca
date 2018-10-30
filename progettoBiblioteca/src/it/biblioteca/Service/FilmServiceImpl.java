package it.biblioteca.Service;

import java.util.Scanner;

import javax.management.StringValueExp;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Film;
import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public class FilmServiceImpl implements FilmService{
	Scanner input=new java.util.Scanner(System.in);
		
	public void creaFilm(Biblioteca biblioteca) {
		System.out.println("INSERISCI NUOVO FILM:");
		System.out.println("ID:");
		long id = input.nextLong();
		input.nextLine();
		System.out.println("TITOLO:");
		String titolo=input.nextLine();
		System.out.println("DURATA:");
		int durata = input.nextInt();
		input.nextLine();
		System.out.println("GENERE:");
		String genere = input.nextLine();
		
		if(genere.equals(Genere.HORROR.name())) {
			Film film = new Film(id, titolo, durata, Genere.HORROR);
			//stampa lista libri horror
			for(int i=0; i<biblioteca.getLista_libro_horror().size(); i++) {
				System.out.println(biblioteca.getLista_libro_horror().get(i));
			}
			System.out.println("SCEGLI IL LIBRO DA ASSOCIARE:");
			int associaLibro = input.nextInt();
			Horror horror = (Horror) biblioteca.getLista_libro_horror().get(associaLibro);
			associaLibroHorror(film, horror);
		}
	
		if(genere.equals( Genere.THRILLER.name())) {
			Film film = new Film(id, titolo, durata, Genere.THRILLER);
			for(int j=0; j<biblioteca.getLista_libro_thriller().size(); j++) {
				System.out.println(biblioteca.getLista_libro_thriller().get(j));
			}
				System.out.println("SCEGLI IL LIBRO DA ASSOCIARE:");
				int associaLibro = input.nextInt();
				Thriller thriller = (Thriller) biblioteca.getLista_libro_thriller().get(associaLibro);
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
			Horror horror = (Horror) biblioteca.getLista_libro_horror().get(i);
			for(int j=0;j<horror.getListaHorror().size();j++) {
				if(horror.getListaHorror().size() > contaH) {
					contaH = horror.getListaHorror().size();
					horrorPF = biblioteca.getLista_libro_horror().get(i);
				}
			}
		}
		
		for(int i=0;i<biblioteca.getLista_libro_thriller().size();i++) {
			Thriller thriller = (Thriller) biblioteca.getLista_libro_thriller().get(i);
			for(int j=0;j<thriller.getListaThriller().size();j++) {
				if(thriller.getListaThriller().size() > contaH) {
					contaT = thriller.getListaThriller().size();
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
		/*
		 * //stampa lista libri horror
			for(int i=0; i<biblioteca.getLista_libro_horror().size(); i++) {
				biblioteca.getLista_libro_horror().get(i).toString();
			}
			System.out.println("SCEGLI IL LIBRO DA ASSOCIARE:");
			int associaLibro = input.nextInt();
			Horror horror = (Horror) biblioteca.getLista_libro_horror().get(associaLibro);
			associaLibroHorror(film, horror);
		 */
		//for(int i=0; i<)
		horror.getListaHorror().add(film);
	}
	@Override
	public void associaLibroThriller(Film film, Thriller thriller) {
		thriller.getListaThriller().add(film);
	}
}
	
	