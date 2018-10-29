package it.biblioteca.Service;

import java.util.ArrayList;

import it.biblioteca.model.Regista;

public interface RegistaService {
	public Regista creaRegista();
	public ArrayList<Regista> visualizzaRegistaCheHaGiratoPiuFilm();
	public ArrayList<Regista> visualizzaRegistaCheHaGiratoPiuFilmGenere();
}
