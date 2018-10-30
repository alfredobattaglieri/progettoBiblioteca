package it.biblioteca.Service;
import java.util.List;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Libro;

public interface ClienteService {
public Cliente creaCliente(String nome, String cognome, int eta);
public void affittaLibro(Libro libro, Cliente cliente);
public List<Libro> visualizzaTuttiLibri(Biblioteca biblioteca);
public List<Libro>visualizzaLibriHorror(Biblioteca biblioteca);
public List<Libro> visualizzaLibriThriller(Biblioteca biblioteca);
}
