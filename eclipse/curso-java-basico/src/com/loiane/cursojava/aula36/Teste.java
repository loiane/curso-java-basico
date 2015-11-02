package com.loiane.cursojava.aula36;

import java.util.Optional;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setTelefone("11 99999-9999");
		
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua dos tronos");
		endereco.setNumero("999");
		endereco.setCep("999999999");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("Westeros");
		
		contato.setEndereco(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("celular 2");
		telefone2.setDdd("11");
		telefone2.setNumero("99999-9998");
		
		Telefone[] telefones = new Telefone[5];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco().getCidade());
		//System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		
		for (int i=0; i<contato.getTelefones().length; i++){
			if (contato.getTelefones()[i] != null){
				System.out.println(contato.getTelefones()[i].getDdd() + " " + contato.getTelefones()[i].getNumero());
			}
		}
	}

}
