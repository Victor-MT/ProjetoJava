package Servicos;

public class Conversao {

	public double convertdouble (String x) {
		String valor = x;

				valor = valor.replace(",", ".");

				Double valorDouble = Double.parseDouble(valor);
				
				return valorDouble;
	}
}
