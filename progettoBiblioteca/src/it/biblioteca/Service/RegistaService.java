package it.biblioteca.Service;

import java.util.ArrayList;

import it.biblioteca.model.Film;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Regista;
import it.biblioteca.model.Thriller;

public interface RegistaService {
	public Regista creaRegista();
	public void associaFilm(Regista regista, Film film)
;	public ArrayList<Regista> visualizzaRegistaCheHaGiratoPiuFilm(Horror horror, Thriller thriller);
	public ArrayList<Regista> visualizzaRegistaCheHaGiratoPiuFilmGenere();
}