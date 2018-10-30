package it.biblioteca.Service;
import java.util.List;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Romanzo;
import it.biblioteca.model.Storia;
import it.biblioteca.model.Thriller;

public interface ClienteService {
<<<<<<< HEAD
public Cliente creaCliente(String nome, String cognome, int eta);
public void affittaLibro(Storia storia, Cliente cliente);
public void affittaLibro(Horror horror, Cliente cliente);
public void affittaLibro(Romanzo romanzo, Cliente cliente);
public void affittaLibro(Thriller thriller, Cliente cliente);
public void restituisciLibro(Cliente cliente);
=======
public Cliente creaCliente(Biblioteca biblioteca);
public void affittaLibro(Libro libro, Cliente cliente);
>>>>>>> refs/remotes/origin/master
public List<Libro> visualizzaTuttiLibri(Biblioteca biblioteca);
public List<Horror> visualizzaLibriHorror(Biblioteca biblioteca);
public List<Thriller> visualizzaLibriThriller(Biblioteca biblioteca);
public int controllaData(String data, String data2);
}
