package herança;

public class Aluno extends Pessoa {

	private Integer rm;
	
	public Aluno(String nome, Integer idade, char sexo, Integer rm) {
		super(nome, idade, sexo);
		this.rm = rm;
	}

	public Integer getRm() {
		return rm;
	}

	public void setRm(Integer rm) {
		this.rm = rm;
	}

	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getSexo()="
				+ getSexo() + "]";
	}

	
	
	
	
	
}
