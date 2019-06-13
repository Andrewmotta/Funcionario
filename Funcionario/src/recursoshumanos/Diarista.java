package recursoshumanos;

public class Diarista extends Funcionario{

	public double valorHora;
	public double qtdHora;
	
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQtdHora() {
		return qtdHora;
	}
	public void setQtdHora(double qtdHora) {
		this.qtdHora = qtdHora;
	}
	public Diarista() {
		super();
	
	}
	public Diarista(long cpf, double valorHora, double qtdHora) {
		super();
		this.cpf = cpf;
		this.valorHora = valorHora;
		this.qtdHora = qtdHora;
		
	}
	 
	
	 @Override 
		public double calcularsaldo(){
			
		 return getValorHora() * getQtdHora();
			
		}
			
	
		
	
}