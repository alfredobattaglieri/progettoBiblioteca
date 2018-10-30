package it.biblioteca.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Genere;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public class ClienteServiceImpl implements ClienteService {
	Scanner input = new Scanner(System.in);

	@Override
	public Cliente creaCliente(String nome, String cognome, int eta, long idCodiceCliente) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
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
		public void affittaLibro(Libro libro, Cliente cliente) {
			Scanner input = new Scanner(System.in);
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& libro.getDisponibilità()>0) {
				System.out.println("inserire giorno e mese in questa modalità: 7-8");
				libro.setData(input.nextLine());
				cliente.getList_libro().add(libro);
			}

		}

		@Override
		public List<Libro> visualizzaTuttiLibri(Biblioteca biblioteca) {
			return biblioteca.getLista_libro();

		}

		@Override
		public List<Libro> visualizzaLibriHorror(Biblioteca biblioteca) {
			return biblioteca.getLista_libro_horror();
		}

		@Override
		public List<Libro> visualizzaLibriThriller(Biblioteca biblioteca) {
			return biblioteca.getLista_libro_thriller();
		}

	
}
