package Encapsulamento;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Nicolas", 19);
		
		System.out.println(pessoa.getNome());
		pessoa.setNome("banana");
		System.out.println(pessoa.getNome());
		
	}
	
}
