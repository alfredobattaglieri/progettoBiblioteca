package it.biblioteca.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;

public class ClienteServiceImpl implements ClienteService {
	Scanner input = new Scanner(System.in);

	@Override
	public Cliente creaCliente(Biblioteca biblioteca) {
		// TODO Auto-generated method stub
		ArrayList<Cliente> cliente;
		
		System.out.println("Crea cliente");
		System.out.println("Inserisci nome");
		String nome=input.nextLine();
		System.out.println("Inserisci cognome");
		String cognome=input.nextLine();
		System.out.println("Inserisci eta");
		int eta=input.nextInt();
		input.nextLine();
		long id=biblioteca.incrementaId(biblioteca.getCliente().size()+1);
		//biblioteca.getCliente().add(biblioteca.getCliente().size()+1);
		
		
		Cliente cliente1=new Cliente(nome , cognome , eta);
		biblioteca.getCliente().add(cliente1);
		return cliente1;
	}

		
		

		@Override
		public void affittaLibro(Libro libro, Cliente cliente) {
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
		public List<Horror> visualizzaLibriHorror(Biblioteca biblioteca) {
			return biblioteca.getLista_libro_horror();
		}

		@Override
		public List<Thriller> visualizzaLibriThriller(Biblioteca biblioteca) {
			return biblioteca.getLista_libro_thriller();
		}
}
