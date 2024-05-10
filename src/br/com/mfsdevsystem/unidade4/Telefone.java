package br.com.mfsdevsystem.unidade4;
/*
 * Author: Marcelino Feliciano de Sousa
 * Versão: 1.0;
 * Descrição: Classe que representa os telefones
 *
 * */

public class Telefone {

	String tipoTelefone;
	String numero;
	
	public Telefone() {
		
	}

	public Telefone(String tipoTelefone, String numero) {
		this.tipoTelefone = tipoTelefone;
		this.numero = numero;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone [tipoTelefone=" + tipoTelefone + ", numero=" + numero + "]";
	}
	
	
}
