package abstração;

public class AguiaAmericana extends Ave {

	private Double tamanhoBicoCM;

	public AguiaAmericana(Double comprimento, Double largura, Double altura, Double peso, Double tamanhoBico) {
		super(comprimento, largura, altura, peso);
		this.tamanhoBicoCM = tamanhoBico;
	}

	public Double getTamanhoBico() {
		return tamanhoBicoCM;
	}

	public void setTamanhoBico(Double tamanhoBico) {
		this.tamanhoBicoCM = tamanhoBico;
	}
	
	@Override
	public void voar() {
		System.out.println("A aguia americana voa!");
	}
	
	
	
}
