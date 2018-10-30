package it.biblioteca.Service;

import java.util.ArrayList;

import it.biblioteca.model.Bibliotecario;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Regista;

public interface BibliotecarioService {
public Bibliotecario creaBibliotecario();
public ArrayList<Regista> visualizzachiHaGiratoPiuFilm();
public Cliente visualizzaRitardoNellaConsegna();
public Cliente visualizzaChiLeggeDiPiuUnGenere();;

}
