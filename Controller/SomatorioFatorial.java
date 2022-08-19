package Controller;

public class SomatorioFatorial {

	public SomatorioFatorial() {
		// TODO Auto-generated constructor stub
		super();
	}

	public double SomatoriaTotal(int numero) {
		if (numero == 1) {
			return 1.0;
		} else {
			double divisao = (1.0 / numeroFatorial(numero));
			return SomatoriaTotal(numero - 1) + divisao;
		}
	}
	
	public int numeroFatorial(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return numero * numeroFatorial(numero - 1);
		}
	}
}
