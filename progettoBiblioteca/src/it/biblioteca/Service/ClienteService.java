package it.biblioteca.Service;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Romanzo;
import it.biblioteca.model.Storia;
import it.biblioteca.model.Thriller;

public interface ClienteService {

public Cliente creaCliente(String nome, String cognome, int eta);
public void affittaLibro(Storia storia, Cliente cliente);
public void affittaLibro(Horror horror, Cliente cliente);
public void affittaLibro(Romanzo romanzo, Cliente cliente);
public void affittaLibro(Thriller thriller, Cliente cliente);
public void restituisciLibro(Cliente cliente);

public void visualizzaTuttiLibri(Biblioteca biblioteca);
public void visualizzaLibriHorror(Biblioteca biblioteca);
public void visualizzaLibriThriller(Biblioteca biblioteca);
public int controllaData(String data, String data2);
}
