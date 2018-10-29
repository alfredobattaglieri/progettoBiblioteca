package it.biblioteca.Service;

import java.util.ArrayList;

import it.biblioteca.model.Cliente;
import it.biblioteca.model.Libro;

public interface ClienteService {
public Cliente creaCliente(String nome, String cognome, int eta, long codiceCliente);
public void affittaLibro(Libro libro);
public ArrayList<Libro> visualizzaTuttiLibri();
public ArrayList<Libro> visualizzaLibroPerGenere(Long id, Libro libro);

}
