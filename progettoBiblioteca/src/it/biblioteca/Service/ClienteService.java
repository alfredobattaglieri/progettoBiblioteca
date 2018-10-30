package it.biblioteca.Service;
import java.util.List;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public interface ClienteService {
public Cliente creaCliente(Biblioteca biblioteca);
public void affittaLibro(Libro libro, Cliente cliente);
public List<Libro> visualizzaTuttiLibri(Biblioteca biblioteca);
public List<Horror> visualizzaLibriHorror(Biblioteca biblioteca);
public List<Thriller> visualizzaLibriThriller(Biblioteca biblioteca);
}
