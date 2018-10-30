package it.biblioteca.Service;


import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Film;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Thriller;

public interface FilmService {
	public void creaFilm(Biblioteca biblioteca);
	public void visualizzaLibroIspiratoPiuFilm(Biblioteca biblioteca);
	public void associaLibroHorror(Film film, Horror horror);
	public void associaLibroThriller(Film film, Thriller thriller);
	public Film scegliFilm(Horror horror,Thriller thriller);
}
