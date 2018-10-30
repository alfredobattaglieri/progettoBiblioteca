package it.biblioteca.Service;

import it.biblioteca.model.Biblioteca;

public interface LibroService {
	
	public Biblioteca creaLibro(Biblioteca biblioteca);
	public void deleteLibro(Biblioteca biblioteca);
}
