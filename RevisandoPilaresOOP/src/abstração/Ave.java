package abstração;

public abstract class Ave {

	private Double comprimento;
	private Double largura;
	private Double altura;
	private Double peso;
	
	public Ave(Double comprimento, Double largura, Double altura, Double peso) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
		this.peso = peso;
	}
	public Double getComprimento() {
		return comprimento;
	}
	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
		
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	// função abstrata
	public abstract void voar();
	
	
	
	
}
