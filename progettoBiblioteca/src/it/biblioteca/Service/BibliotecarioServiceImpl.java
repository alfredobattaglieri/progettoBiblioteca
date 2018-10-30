package it.biblioteca.Service;

import java.util.ArrayList;
import java.util.Scanner;

import it.biblioteca.model.Bibliotecario;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Regista;

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
	public ArrayList<Regista> visualizzachiHaGiratoPiuFilm() {
		// TODO Auto-generated method stub
		return null;
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

	
	
	
}
