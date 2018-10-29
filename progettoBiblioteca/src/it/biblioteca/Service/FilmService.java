package it.biblioteca.Service;


import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public interface FilmService {
	public void creaFilm(Horror horror,Thriller thriller);
	public Libro visualizzaLibroIspiratoPiuFilm(Horror horror, Thriller thriller);
}
