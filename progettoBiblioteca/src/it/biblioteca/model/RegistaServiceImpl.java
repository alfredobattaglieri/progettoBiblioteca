package it.biblioteca.model;

import java.util.ArrayList;
import java.util.Scanner;

import it.biblioteca.Service.RegistaService;

public class RegistaServiceImpl implements RegistaService {

	@Override
	public Regista creaRegista() {
		Scanner input= new Scanner(System.in);
		System.out.println("Inserire l'id");
		Regista regista=new Regista(input.nextLong());
		System.out.println("inserire nome e cognome");
		regista.setNome(input.nextLine());
		regista.setCognome(input.nextLine());
		System.out.println("inserisci l'età");
		regista.setEta(input.nextInt());
		return regista;
		
		
	}

	@Override
	public ArrayList<Regista> visualizzaRegistaCheHaGiratoPiuFilm(Horror horror, Thriller trhiller) {

		return null;
	}

	@Override
	public ArrayList<Regista> visualizzaRegistaCheHaGiratoPiuFilmGenere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void associaFilm(Regista regista, Film film) {
		// TODO Auto-generated method stub
		
	}
}
