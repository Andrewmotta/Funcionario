package recursoshumanos;

public class Principal {

public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(85858585,1014.50,23.35);
		
		System.out.println("Saldo do Funcionario "+f1.calcularsaldo());
		
		Vendedor v1 = new Vendedor(82558255,1014.50,23.35,52.50);
		
		System.out.println("Saldo do Vendedor "+v1.calcularsaldo());
	
	
		
		System.out.println("\n");
		
		Funcionario f2;
		
		f2 = new Funcionario(85858585,1014.50,23.35);
	
		System.out.println("Saldo do Funcionario "+f2.calcularsaldo());
		
	
		f2 = new Diarista(85858585,5,25.50);
		
		System.out.println("Saldo da Diarista "+f2.calcularsaldo());
	}

}
