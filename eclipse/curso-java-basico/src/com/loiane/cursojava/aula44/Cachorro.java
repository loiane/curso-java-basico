package com.loiane.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

	private int tamanho;
	private String racao;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getRacao() {
		return racao;
	}
	public void setRacao(String racao) {
		this.racao = racao;
	}
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	
	
}
