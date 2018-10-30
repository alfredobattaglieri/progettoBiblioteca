package it.biblioteca.Service;

import java.util.ArrayList;
import java.util.Scanner;
import it.biblioteca.model.Bibliotecario;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Romanzo;
import it.biblioteca.model.Storia;
import it.biblioteca.model.Thriller;


public class BibliotecarioServiceImpl implements BibliotecarioService{
Scanner input=new Scanner(System.in);
	@Override
	public Bibliotecario creaBibliotecario() {
		// TODO Auto-generated method stub
		Bibliotecario bibliotecario= new Bibliotecario();
		System.out.println("Inserisci nome");
		bibliotecario.setNome(input.nextLine());
		System.out.println("Inserisci cognome");
		bibliotecario.setCognome(input.nextLine());
		System.out.println("Inserisci eta");
		bibliotecario.setEta(input.nextInt());
		input.nextLine();
		bibliotecario.incrementaId(bibliotecario.getId());
		return bibliotecario;
	}

	@Override
	public Cliente visualizzaRitardoNellaConsegna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente visualizzaChiLeggeDiPiuUnGenere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bibliotecario ChiAffittaPiuLibri() {
		ArrayList<Horror> lista_libro_horror;
		ArrayList<Thriller> lista_libro_thriller;
		ArrayList<Romanzo> lista_libro_romanzo;
		ArrayList<Storia> lista_libro_storia;
		Cliente cliente=new Cliente();
		int affitto_max=0;
		
		for (int l=0;l<cliente.getList_libro().size();l++) {
			if(cliente.getList_libro().size()> affitto_max) {
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
