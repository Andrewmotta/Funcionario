package recursoshumanos;

public class Vendedor extends Funcionario{

public double comissao;
	
	
	
	public void setComissao(double comissao){
		this.comissao = comissao;
		}
	public double getComissao(){
		return this.comissao;
	}
	
	public Vendedor(long cpf, double salario, double desconto,double comissao) {
		super();
		this.cpf = cpf;
		this.salario = salario;
		this.desconto = desconto;
		this.comissao = comissao;
		
	}
	
    @Override 
	public double calcularsaldo(){
		
	return  this.comissao + (this.salario - this.desconto);
		
	}
	
}
