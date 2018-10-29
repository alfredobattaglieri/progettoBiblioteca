package it.biblioteca.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.biblioteca.model.Film;
import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public class FilmServiceImpl implements FilmService{
	Scanner input=new java.util.Scanner(System.in);
	
	public void creaFilm(Horror horror,Thriller thriller) {
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
			horror.getListaHorror().add(film);
		}
		if(genere.equals(Genere.THRILLER)) {
			Film film = new Film(id, titolo, durata, Genere.THRILLER);
			thriller.getListaThriller().add(film);
		}
	}
	
	@Override
	public Libro visualizzaLibroIspiratoPiuFilm(Horror horror, Thriller thriller){
		Libro horrorPF = null;
		Libro thrillerPF = null;
		
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
}
	
	