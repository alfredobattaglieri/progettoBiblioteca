package it.biblioteca.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.biblioteca.model.Cliente;
import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public class UtenteServiceImpl implements ClienteService{
	Scanner input=new Scanner(System.in);
	
	@Override
	public Cliente creaCliente(String nome, String cognome, int eta, long idCodiceCliente) {
		// TODO Auto-generated method stub
		Cliente cliente= new Cliente();
		System.out.println("Crea cliente");
		System.out.println("Inserisci nome");
		cliente.setNome(input.nextLine());
		System.out.println("Inserisci cognome");
		cliente.setCognome(input.nextLine());
		System.out.println("Inserisci eta");
		cliente.setEta(input.nextInt());
		input.nextLine();
		System.out.println("Inserisci codice cliente");
		cliente.setIdCodiceCliente(input.nextLong());
		input.nextLine();
		return cliente;
	}

	@Override
	public void affittaLibro(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Libro> visualizzaTuttiLibri() {
		
			
		}
	
			
		
		return null;
	}
	@Override
	public ArrayList<Libro> visualizzaLibroPerGenere(Long id, Libro libro) {
		// TODO Auto-generated method stub
		return null;
	}

}
