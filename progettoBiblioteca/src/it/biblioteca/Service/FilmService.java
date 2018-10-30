package it.biblioteca.Service;


import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Film;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public interface FilmService {
	public void creaFilm();
	public void visualizzaLibroIspiratoPiuFilm(Biblioteca biblioteca);
	public void associaLibroHorror(Film film, Horror horror);
	public void associaLibroThriller(Film film, Thriller thriller);
}
