package it.biblioteca.Service;

import java.util.ArrayList;

import it.biblioteca.model.Cliente;
import it.biblioteca.model.Libro;

public interface UtenteService {
public Cliente creaCliente();
public void affittaLibro(Libro libro);
public ArrayList<Libro> visualizzaTuttiLibri();
public ArrayList<Libro> visualizzaLibroPerGenere(Long id, Libro libro);

}
