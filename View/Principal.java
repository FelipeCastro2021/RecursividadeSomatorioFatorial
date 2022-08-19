package View;

import Controller.SomatorioFatorial;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomatorioFatorial somatorioFatorial = new SomatorioFatorial();
		
		int numero = 3;
		
		double resultado = somatorioFatorial.SomatoriaTotal(numero);
		
		System.out.println(resultado);

		double total = (1.0 / 1) + (1.0 / 2) + (1.0 / 6);
				
		System.out.println(total);
	}

}
