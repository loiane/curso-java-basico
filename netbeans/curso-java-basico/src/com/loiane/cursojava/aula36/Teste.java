package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		//classe simples
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setTelefone("11 99999-9999");
		//contato.setEndereco("Rua dos Tronos, 999 - Kings Landing");
		
		//relacionamento tem-um - Endereco
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua dos Tronos");
		endereco.setNumero("999");
		endereco.setComplemento("-");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("Westeros");
		endereco.setCep("99999-999");
		
		contato.setEndereco(endereco);
		
		//relacionamento tem-muitos - Telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("celular2");
		telefone2.setDdd("19");
		telefone2.setNumero("99999-9998");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		//contato.setTelefone(telefone);
		
		//Teste saída no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getNomeRua());
		}
		
		if (contato !=null && contato.getTelefones()!=null){
			
			for (Telefone t : contato.getTelefones()){
				System.out.println(t.getNumero());
			}
		}
	}

}
