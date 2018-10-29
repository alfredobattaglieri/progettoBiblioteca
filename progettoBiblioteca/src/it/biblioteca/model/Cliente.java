package it.biblioteca.model;

public class Cliente extends Persona{
	long idCodiceCliente;
	
	//Get and Set
	public long getIdCodiceCliente() {
		return idCodiceCliente;
	}

	public void setIdCodiceCliente(long idCodiceCliente) {
		this.idCodiceCliente = idCodiceCliente;
	}

	public Cliente(long idCodiceCliente) {
		super();
		this.idCodiceCliente = idCodiceCliente;
	}
	
	//to string
	@Override
	public String toString() {
		return "Cliente [idCodiceCliente=" + idCodiceCliente + ", id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+ ", eta=" + eta + "]";
	}
	
}
