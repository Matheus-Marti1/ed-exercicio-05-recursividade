package controller;

public class SomatoriaController {

	public SomatoriaController() {
		super();
	}

	public double somatoria(int n) {
		// A condição de parada será quando o número inserido para a somatória for 1 ou
		// quando o n chegar em 1, ficando então 1/1. Então o retorno será 1.
		if (n == 1) {
			return 1;
		}
		// O código irá fazer a conta de 1/N, e somará com o próximo termo chamando a
		// função novamente, mas enviando n - 1, até que esse N seja 1.
		else {
			return (1 / (double) n) + somatoria(n - 1);
		}
	}

}
